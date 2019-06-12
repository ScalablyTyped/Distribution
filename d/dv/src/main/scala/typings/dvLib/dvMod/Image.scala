package typings
package dvLib.dvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dv", "Image")
@js.native
class Image protected () extends js.Object {
  /**
  	 *  Creates a copy of otherImage.
  	 */
  def this(otherImage: Image) = this()
  def this(`type`: dvLib.dvLibStrings.jpg, buffer: nodeLib.Buffer) = this()
  /**
  	 * Creates an image from a Buffer object, that contains the PNG/JPG encoded image.
  	 */
  def this(`type`: dvLib.dvLibStrings.png, buffer: nodeLib.Buffer) = this()
  /**
  	 * Creates a 32 bit imagen from three 8 bit images, where each image represents one channel of RGB or HSV.
  	 */
  def this(image1: Image, image2: Image, image3: Image) = this()
  /**
  	 * Creates an empty image with the specified dimensions (!!! note: this constructor is experimental and likely to change).
  	 */
  def this(width: scala.Double, height: scala.Double, depth: scala.Double) = this()
  def this(`type`: dvLib.dvLibStrings.gray, buffer: nodeLib.Buffer, width: scala.Double, height: scala.Double) = this()
  def this(`type`: dvLib.dvLibStrings.rgba, buffer: nodeLib.Buffer, width: scala.Double, height: scala.Double) = this()
  def this(`type`: dvLib.dvLibStrings.rgb, buffer: nodeLib.Buffer, width: scala.Double, height: scala.Double) = this()
  /**
  	 * The depth of the image in bits per pixel, i.e. one of 32 (color), 8 (grayscale) or 1 (monochrome).
  	 */
  val depth: scala.Double = js.native
  val height: scala.Double = js.native
  val width: scala.Double = js.native
  /**
  	 * If the images are monochrome, dispatches to Leptonica's pixOr. Otherwise, returns the channelwise addition of b to a, clipped at 255.
  	 */
  def add(otherImage: Image): Image = js.native
  /**
  	 * Returns the (boolean) difference of two images with equal depth, aligning them to the upper left corner.
  	 */
  def and(otherImage: Image): Image = js.native
  /**
  	 * Available for grayscale and color images. Channelwise maps each pixel of image using mapping, which must be an array of length 256 with integer values between 0 and 255.
  	 * !!! !!! Note: this function actually changes the image!
  	 * The mask parameter is optional and must be a monochrome image of same width and height; only pixels where mask is 0 will be modified.
  	 */
  def applyCurve(mapping: js.Array[scala.Double]): this.type = js.native
  def applyCurve(mapping: js.Array[scala.Double], mask: Image): this.type = js.native
  /**
  	 * !!! Note: this function actually changes the image!
  	 * Fills a specified rectangle with white.
  	 */
  def clearBox(box: Box): this.type = js.native
  def clearBox(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): this.type = js.native
  /**
  	 * Applies a Close Filter and returns the result.
  	 */
  def close(width: scala.Double, height: scala.Double): Image = js.native
  /**
  	 * Only available for monochrome images. Tries to extract connected components (think of flood fill). The connectivity can be specified as 4 or 8 directions.
  	 */
  @JSName("connectedComponents")
  def connectedComponents_4(connectivity: dvLib.dvLibNumbers.`4`): js.Array[Component] = js.native
  @JSName("connectedComponents")
  def connectedComponents_8(connectivity: dvLib.dvLibNumbers.`8`): js.Array[Component] = js.native
  /**
  	 * Applies a convoltuion kernel with the specified dimensions. Image convolution is an operation where each destination pixel is computed based on a weighted sum of a set of nearby source pixels.
  	 */
  def convolve(halfWidth: scala.Double, halfHeight: scala.Double): Image = js.native
  /**
  	 * Crops an image from this image by the specified rectangle and returns the resulting image.
  	 */
  def crop(box: Box): Image = js.native
  def crop(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): Image = js.native
  /**
  	 * Applies a Dilate Filter and returns the result.
  	 */
  def dilate(width: scala.Double, height: scala.Double): Image = js.native
  /**
  	 * The Distance Function works on 1bpp images. It labels each pixel with the largest distance between this and any other pixel in its connected component. The connectivity is either 4 or 8.
  	 */
  @JSName("distanceFunction")
  def distanceFunction_4(connectivity: dvLib.dvLibNumbers.`4`): Image = js.native
  @JSName("distanceFunction")
  def distanceFunction_8(connectivity: dvLib.dvLibNumbers.`8`): Image = js.native
  /**
  	 * !!! Note: this function actually changes the image!
  	 * Draws a rectangle to this image with the specified border in the specified color with an optional blending parameter (0.0: transparent; 1.0: no transparency).
  	 */
  def drawBox(box: Box, borderWidth: scala.Double, red: scala.Double, green: scala.Double, blue: scala.Double): this.type = js.native
  def drawBox(
    box: Box,
    borderWidth: scala.Double,
    red: scala.Double,
    green: scala.Double,
    blue: scala.Double,
    frac: scala.Double
  ): this.type = js.native
  def drawBox(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    borderWidth: scala.Double,
    red: scala.Double,
    green: scala.Double,
    blue: scala.Double
  ): this.type = js.native
  def drawBox(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    borderWidth: scala.Double,
    red: scala.Double,
    green: scala.Double,
    blue: scala.Double,
    frac: scala.Double
  ): this.type = js.native
  @JSName("drawBox")
  def drawBox_clear(box: Box, borderWidth: scala.Double, operation: dvLib.dvLibStrings.clear): this.type = js.native
  @JSName("drawBox")
  def drawBox_clear(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    borderWidth: scala.Double,
    operation: dvLib.dvLibStrings.clear
  ): this.type = js.native
  @JSName("drawBox")
  def drawBox_flip(box: Box, borderWidth: scala.Double, operation: dvLib.dvLibStrings.flip): this.type = js.native
  @JSName("drawBox")
  def drawBox_flip(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    borderWidth: scala.Double,
    operation: dvLib.dvLibStrings.flip
  ): this.type = js.native
  /**
  	 * !!! Note: this function actually changes the image!
  	 * Draws a rectangle to this image with the specified border. The possible pixel manipulating operations are set, clear and flip.
  	 */
  @JSName("drawBox")
  def drawBox_set(box: Box, borderWidth: scala.Double, operation: dvLib.dvLibStrings.set): this.type = js.native
  @JSName("drawBox")
  def drawBox_set(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    borderWidth: scala.Double,
    operation: dvLib.dvLibStrings.set
  ): this.type = js.native
  /**
  	 * !!! Note: this function actually changes the image!
  	 * Draws an image to this image with the specified destination box.
  	 */
  def drawImage(image: Image, box: Box): this.type = js.native
  def drawImage(image: Image, x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): this.type = js.native
  /**
  	 * !!! Note: this function actually changes the image!
  	 * Draws a line between p1 and p2 to this image with the specified line width in the specified color with an optional blending parameter (0.0: transparent; 1.0: no transparency).
  	 */
  def drawLine(
    p1: Point,
    p2: Point,
    width: scala.Double,
    red: scala.Double,
    green: scala.Double,
    blue: scala.Double
  ): this.type = js.native
  def drawLine(
    p1: Point,
    p2: Point,
    width: scala.Double,
    red: scala.Double,
    green: scala.Double,
    blue: scala.Double,
    frac: scala.Double
  ): this.type = js.native
  @JSName("drawLine")
  def drawLine_clear(p1: Point, p2: Point, width: scala.Double, operation: dvLib.dvLibStrings.clear): this.type = js.native
  @JSName("drawLine")
  def drawLine_flip(p1: Point, p2: Point, width: scala.Double, operation: dvLib.dvLibStrings.flip): this.type = js.native
  /**
  	 * !!! Note: this function actually changes the image!
  	 * Draws a line between p1 and p2 to this image with the specified line width. The possible pixel manipulating operations are set, clear and flip.
  	 */
  @JSName("drawLine")
  def drawLine_set(p1: Point, p2: Point, width: scala.Double, operation: dvLib.dvLibStrings.set): this.type = js.native
  /**
  	 * Applies an Erode Filter and returns the result.
  	 */
  def erode(width: scala.Double, height: scala.Double): Image = js.native
  /**
  	 * !!! Note: this function actually changes the image!
  	 * Draws a filled rectangle to this image in the specified color with an optional blending parameter (0.0: transparent; 1.0: no transparency).
  	 */
  def fillBox(box: Box, r: scala.Double, g: scala.Double, b: scala.Double): this.type = js.native
  def fillBox(box: Box, r: scala.Double, g: scala.Double, b: scala.Double, fraction: scala.Double): this.type = js.native
  /**
  	 * !!! Note: this function actually changes the image!
  	 * Draws a filled rectangle to this image with the specified value. Works for 8bpp and 1bpp images.
  	 */
  def fillBox(box: Box, value: scala.Double): this.type = js.native
  def fillBox(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    r: scala.Double,
    g: scala.Double,
    b: scala.Double
  ): this.type = js.native
  def fillBox(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    r: scala.Double,
    g: scala.Double,
    b: scala.Double,
    fraction: scala.Double
  ): this.type = js.native
  def fillBox(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double, value: scala.Double): this.type = js.native
  /**
  	 * Only available for monochrome images. Tries to find the skew of this image. The resulting angle is in degree. The confidence is between 0.0 and 1.0.
  	 */
  def findSkew(): Skew = js.native
  /**
  	 * Only available for grayscale images. Returns the histogram in an array of length 256, where each entry represents the fraction (0.0 to 1.0) of that color in the image.
  	 * The mask parameter is optional and must be a monochrome image of same width and height; only pixels where mask is 0 will be counted.
  	 */
  def histogram(): Image = js.native
  def histogram(mask: Image): Image = js.native
  /**
  	 * Creates a mask by testing if pixels (RGB, HSV, ...) are between lower and upper. Formally speaking:
  	 * lower1 ≤ pixel1 ≤ upper1
  	 * ∧ lower2 ≤ pixel2 ≤ upper2
  	 * ∧ lower3 ≤ pixel3 ≤ upper3
  	 */
  def inRange(
    lower1: scala.Double,
    lower2: scala.Double,
    lower3: scala.Double,
    upper1: scala.Double,
    upper2: scala.Double,
    upper3: scala.Double
  ): Image = js.native
  /**
  	 * Returns the (boolean) inverse of this image.
  	 */
  def invert(): Image = js.native
  /**
  	 * Detects Line Segments with the specified accuracy (3 is a good start). The number of found line segments can be limited using maxLineSegments (0 is unlimited).
  	 */
  def lineSegments(accuracy: scala.Double, maxLineSegments: scala.Double, useWeightedMeanShift: scala.Boolean): js.Array[Segment] = js.native
  @JSName("maxDynamicRange")
  def maxDynamicRange_linear(scale: dvLib.dvLibStrings.linear): Image = js.native
  /**
  	 * Scales an 8bpp image for maximum dynamic range. scale must be either log or linear.
  	 */
  @JSName("maxDynamicRange")
  def maxDynamicRange_log(scale: dvLib.dvLibStrings.log): Image = js.native
  /**
  	 * Color image quantization using median cut algorithm.
  	 * colors must be between 2 and 256.
  	 * Note that support for the resulting palette image is highly experimental at this point;
  	 * only toGray() and toBuffer('png') are guaranteed to work.
  	 */
  def medianCutQuant(colors: scala.Double): Image = js.native
  /**
  	 * Color image quantization using an octree based algorithm.
  	 * colors must be between 2 and 256.
  	 * Note that support for the resulting palette image is highly experimental at this point;
  	 * only toGray() and toBuffer('png') are guaranteed to work.
  	 */
  def octreeColorQuant(colors: scala.Double): Image = js.native
  /**
  	 * Applies an Open Filter and returns the result.
  	 */
  def open(width: scala.Double, height: scala.Double): Image = js.native
  /**
  	 * Returns the (boolean) union of two images with equal depth, aligning them to the upper left corner.
  	 */
  def or(otherImage: Image): Image = js.native
  /**
  	 * Applies Otsu's Method for computing the threshold of a grayscale image.
  	 * It computes a threshold for each tile of the specified size and performs the threshold operation,
  	 * resulting in a binary image for each tile. These are stitched into the final result.
  	 * The smooth size controls the a convolution kernel applied to threshold array (use 0 for no smoothing).
  	 * The score factor controls the fraction of the max. Otsu score (typically 0.1; use 0.0 for standard Otsu).
  	 */
  def otsuAdaptiveThreshold(
    tileWidth: scala.Double,
    tileHeight: scala.Double,
    smoothWidth: scala.Double,
    smoothHeight: scala.Double,
    scoreFactor: scala.Double
  ): Image = js.native
  /**
  	 * Computes the horizontal or vertical projection of an 1bpp or 8bpp image.
  	 */
  @JSName("projection")
  def projection_horizontal(mode: dvLib.dvLibStrings.horizontal): js.Array[scala.Double] = js.native
  @JSName("projection")
  def projection_vertical(mode: dvLib.dvLibStrings.vertical): js.Array[scala.Double] = js.native
  /**
  	 * Applies a rank (0.0 ... 1.0) filter of the specified width
  	 * and height (think of it as radius) to this image
  	 * and returns the result.
  	 * If you set rank to 0.5 you'll get a Median Filter.
  	 * Note that this type of filter works best with odd sizes like 3 or 5.
  	 */
  def rankFilter(width: scala.Double, height: scala.Double, rank: scala.Double): Image = js.native
  /**
  	 * Rotates the image around its center by the specified angle in degrees.
  	 */
  def rotate(angle: scala.Double): Image = js.native
  /**
  	 * Scales an image by scaleX and scaleY (1.0 = 100%).
  	 */
  def scale(scaleX: scala.Double, scaleY: scala.Double): Image = js.native
  /**
  	 * Scales an image proportionally by scale (1.0 = 100%).
  	 */
  def scale(scale: scala.Double): Image = js.native
  /**
  	 * Sets the specified value to each pixel set in the mask.
  	 */
  def setMasked(mask: Image, value: scala.Double): Image = js.native
  /**
  	 * If the images are monochrome, dispatches to Leptonica's pixSubtract and is equivalent to a.and(b.invert()).
  	 * For grayscale images, returns the pixelwise subtraction of b from a, clipped at zero.
  	 * For color, the entire RGB value is subtracted instead of doing channelwise subtraction (ask Leptonica why).
  	 * @example:
  	 * redness = colorImage.toGray(1, 0, 0).subtract(colorImage.toGray(0, 0.5, 0.5))
  	 */
  def subtract(otherImage: Image): Image = js.native
  @JSName("thin")
  def thin_bg(`type`: dvLib.dvLibStrings.bg, connectivity: scala.Double, maxIterations: scala.Double): Image = js.native
  /**
  	 * Applies morphological thinning of type (fg or bg) with the specified connectivitiy (4 or 8) and maxIterations (0 to iterate until complete).
  	 */
  @JSName("thin")
  def thin_fg(`type`: dvLib.dvLibStrings.fg, connectivity: scala.Double, maxIterations: scala.Double): Image = js.native
  /**
  	 * Converts a grayscale image to monochrome using a global threshold. value must be between 0 and 255.
  	 */
  def threshold(value: scala.Double): Image = js.native
  /**
  	 * Converts the Image in the specified format to a buffer.
  	 * Specifying raw returns the raw image data as buffer.
  	 * For color images, the result contains three bytes per pixel in the order R, G, B;
  	 * for grayscale and monochrome images, it contains one byte per pixel.
  	 * Specifying png returns a PNG encoded image as buffer.
  	 * Specifying jpg returns a JPG encoded image as buffer.
  	 */
  def toBuffer(): nodeLib.Buffer = js.native
  @JSName("toBuffer")
  def toBuffer_jpg(format: dvLib.dvLibStrings.jpg): nodeLib.Buffer = js.native
  @JSName("toBuffer")
  def toBuffer_png(format: dvLib.dvLibStrings.png): nodeLib.Buffer = js.native
  @JSName("toBuffer")
  def toBuffer_raw(format: dvLib.dvLibStrings.raw): nodeLib.Buffer = js.native
  /**
  	 * Converts a grayscale image to a color image.
  	 */
  def toColor(): Image = js.native
  /**
  	 * Converts an image to grayscale using default settings. Can be used to convert monochrome images back to grayscale.
  	 */
  def toGray(): Image = js.native
  /**
  	 * Converts an RGB image to grayscale using the specified widths for each channel.
  	 */
  def toGray(redWeight: scala.Double, greenWeight: scala.Double, blueWeight: scala.Double): Image = js.native
  @JSName("toGray")
  def toGray_max(selector: dvLib.dvLibStrings.max): Image = js.native
  /**
  	 * Converts an RGB image to grayscale by selecting either the 'min' or 'max' channel.
  	 * This can act as a simple color filter: 'max' maps colored pixels towards white,
  	 * while 'min' maps colored pixels towards black.
  	 */
  @JSName("toGray")
  def toGray_min(selector: dvLib.dvLibStrings.min): Image = js.native
  /**
  	 * Converts from RGB to HSV color space. HSV has the following ranges:
  	 * Hue: [0 .. 239]
  	 * Saturation: [0 .. 255]
  	 * Value: [0 .. 255]
  	 */
  def toHSV(): Image = js.native
  /**
  	 * Converts from HSV to RGB color space.
  	 */
  def toRGB(): Image = js.native
  /**
  	 * Unsharp Masking creates an unsharp mask using halfWidth.
  	 * The fraction determines how much of the edge is added back into image.
  	 * The resulting image appears clearer, but it is generally less accurate.
  	 */
  def unsharp(halfWidth: scala.Double, fraction: scala.Double): Image = js.native
  /**
  	 * Returns the (boolean) exclusive disjunction of two images with equal depth, aligning them to the upper left corner.
  	 */
  def xor(otherImage: Image): Image = js.native
}

