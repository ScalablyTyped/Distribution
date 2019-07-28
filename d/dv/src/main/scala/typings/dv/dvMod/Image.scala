package typings.dv.dvMod

import typings.dv.dvNumbers.`4`
import typings.dv.dvNumbers.`8`
import typings.dv.dvStrings.bg
import typings.dv.dvStrings.clear
import typings.dv.dvStrings.fg
import typings.dv.dvStrings.flip
import typings.dv.dvStrings.gray
import typings.dv.dvStrings.horizontal
import typings.dv.dvStrings.jpg
import typings.dv.dvStrings.linear
import typings.dv.dvStrings.log
import typings.dv.dvStrings.max
import typings.dv.dvStrings.min
import typings.dv.dvStrings.png
import typings.dv.dvStrings.raw
import typings.dv.dvStrings.rgb
import typings.dv.dvStrings.rgba
import typings.dv.dvStrings.set
import typings.dv.dvStrings.vertical
import typings.node.Buffer
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
  def this(`type`: jpg, buffer: Buffer) = this()
  /**
  	 * Creates an image from a Buffer object, that contains the PNG/JPG encoded image.
  	 */
  def this(`type`: png, buffer: Buffer) = this()
  /**
  	 * Creates a 32 bit imagen from three 8 bit images, where each image represents one channel of RGB or HSV.
  	 */
  def this(image1: Image, image2: Image, image3: Image) = this()
  /**
  	 * Creates an empty image with the specified dimensions (!!! note: this constructor is experimental and likely to change).
  	 */
  def this(width: Double, height: Double, depth: Double) = this()
  def this(`type`: gray, buffer: Buffer, width: Double, height: Double) = this()
  def this(`type`: rgba, buffer: Buffer, width: Double, height: Double) = this()
  def this(`type`: rgb, buffer: Buffer, width: Double, height: Double) = this()
  /**
  	 * The depth of the image in bits per pixel, i.e. one of 32 (color), 8 (grayscale) or 1 (monochrome).
  	 */
  val depth: Double = js.native
  val height: Double = js.native
  val width: Double = js.native
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
  def applyCurve(mapping: js.Array[Double]): this.type = js.native
  def applyCurve(mapping: js.Array[Double], mask: Image): this.type = js.native
  /**
  	 * !!! Note: this function actually changes the image!
  	 * Fills a specified rectangle with white.
  	 */
  def clearBox(box: Box): this.type = js.native
  def clearBox(x: Double, y: Double, width: Double, height: Double): this.type = js.native
  /**
  	 * Applies a Close Filter and returns the result.
  	 */
  def close(width: Double, height: Double): Image = js.native
  /**
  	 * Only available for monochrome images. Tries to extract connected components (think of flood fill). The connectivity can be specified as 4 or 8 directions.
  	 */
  @JSName("connectedComponents")
  def connectedComponents_4(connectivity: `4`): js.Array[Component] = js.native
  @JSName("connectedComponents")
  def connectedComponents_8(connectivity: `8`): js.Array[Component] = js.native
  /**
  	 * Applies a convoltuion kernel with the specified dimensions. Image convolution is an operation where each destination pixel is computed based on a weighted sum of a set of nearby source pixels.
  	 */
  def convolve(halfWidth: Double, halfHeight: Double): Image = js.native
  /**
  	 * Crops an image from this image by the specified rectangle and returns the resulting image.
  	 */
  def crop(box: Box): Image = js.native
  def crop(x: Double, y: Double, width: Double, height: Double): Image = js.native
  /**
  	 * Applies a Dilate Filter and returns the result.
  	 */
  def dilate(width: Double, height: Double): Image = js.native
  /**
  	 * The Distance Function works on 1bpp images. It labels each pixel with the largest distance between this and any other pixel in its connected component. The connectivity is either 4 or 8.
  	 */
  @JSName("distanceFunction")
  def distanceFunction_4(connectivity: `4`): Image = js.native
  @JSName("distanceFunction")
  def distanceFunction_8(connectivity: `8`): Image = js.native
  /**
  	 * !!! Note: this function actually changes the image!
  	 * Draws a rectangle to this image with the specified border in the specified color with an optional blending parameter (0.0: transparent; 1.0: no transparency).
  	 */
  def drawBox(box: Box, borderWidth: Double, red: Double, green: Double, blue: Double): this.type = js.native
  def drawBox(box: Box, borderWidth: Double, red: Double, green: Double, blue: Double, frac: Double): this.type = js.native
  def drawBox(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    borderWidth: Double,
    red: Double,
    green: Double,
    blue: Double
  ): this.type = js.native
  def drawBox(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    borderWidth: Double,
    red: Double,
    green: Double,
    blue: Double,
    frac: Double
  ): this.type = js.native
  @JSName("drawBox")
  def drawBox_clear(box: Box, borderWidth: Double, operation: clear): this.type = js.native
  @JSName("drawBox")
  def drawBox_clear(x: Double, y: Double, width: Double, height: Double, borderWidth: Double, operation: clear): this.type = js.native
  @JSName("drawBox")
  def drawBox_flip(box: Box, borderWidth: Double, operation: flip): this.type = js.native
  @JSName("drawBox")
  def drawBox_flip(x: Double, y: Double, width: Double, height: Double, borderWidth: Double, operation: flip): this.type = js.native
  /**
  	 * !!! Note: this function actually changes the image!
  	 * Draws a rectangle to this image with the specified border. The possible pixel manipulating operations are set, clear and flip.
  	 */
  @JSName("drawBox")
  def drawBox_set(box: Box, borderWidth: Double, operation: set): this.type = js.native
  @JSName("drawBox")
  def drawBox_set(x: Double, y: Double, width: Double, height: Double, borderWidth: Double, operation: set): this.type = js.native
  /**
  	 * !!! Note: this function actually changes the image!
  	 * Draws an image to this image with the specified destination box.
  	 */
  def drawImage(image: Image, box: Box): this.type = js.native
  def drawImage(image: Image, x: Double, y: Double, width: Double, height: Double): this.type = js.native
  /**
  	 * !!! Note: this function actually changes the image!
  	 * Draws a line between p1 and p2 to this image with the specified line width in the specified color with an optional blending parameter (0.0: transparent; 1.0: no transparency).
  	 */
  def drawLine(p1: Point, p2: Point, width: Double, red: Double, green: Double, blue: Double): this.type = js.native
  def drawLine(p1: Point, p2: Point, width: Double, red: Double, green: Double, blue: Double, frac: Double): this.type = js.native
  @JSName("drawLine")
  def drawLine_clear(p1: Point, p2: Point, width: Double, operation: clear): this.type = js.native
  @JSName("drawLine")
  def drawLine_flip(p1: Point, p2: Point, width: Double, operation: flip): this.type = js.native
  /**
  	 * !!! Note: this function actually changes the image!
  	 * Draws a line between p1 and p2 to this image with the specified line width. The possible pixel manipulating operations are set, clear and flip.
  	 */
  @JSName("drawLine")
  def drawLine_set(p1: Point, p2: Point, width: Double, operation: set): this.type = js.native
  /**
  	 * Applies an Erode Filter and returns the result.
  	 */
  def erode(width: Double, height: Double): Image = js.native
  /**
  	 * !!! Note: this function actually changes the image!
  	 * Draws a filled rectangle to this image in the specified color with an optional blending parameter (0.0: transparent; 1.0: no transparency).
  	 */
  def fillBox(box: Box, r: Double, g: Double, b: Double): this.type = js.native
  def fillBox(box: Box, r: Double, g: Double, b: Double, fraction: Double): this.type = js.native
  /**
  	 * !!! Note: this function actually changes the image!
  	 * Draws a filled rectangle to this image with the specified value. Works for 8bpp and 1bpp images.
  	 */
  def fillBox(box: Box, value: Double): this.type = js.native
  def fillBox(x: Double, y: Double, width: Double, height: Double, r: Double, g: Double, b: Double): this.type = js.native
  def fillBox(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    r: Double,
    g: Double,
    b: Double,
    fraction: Double
  ): this.type = js.native
  def fillBox(x: Double, y: Double, width: Double, height: Double, value: Double): this.type = js.native
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
  def inRange(lower1: Double, lower2: Double, lower3: Double, upper1: Double, upper2: Double, upper3: Double): Image = js.native
  /**
  	 * Returns the (boolean) inverse of this image.
  	 */
  def invert(): Image = js.native
  /**
  	 * Detects Line Segments with the specified accuracy (3 is a good start). The number of found line segments can be limited using maxLineSegments (0 is unlimited).
  	 */
  def lineSegments(accuracy: Double, maxLineSegments: Double, useWeightedMeanShift: Boolean): js.Array[Segment] = js.native
  @JSName("maxDynamicRange")
  def maxDynamicRange_linear(scale: linear): Image = js.native
  /**
  	 * Scales an 8bpp image for maximum dynamic range. scale must be either log or linear.
  	 */
  @JSName("maxDynamicRange")
  def maxDynamicRange_log(scale: log): Image = js.native
  /**
  	 * Color image quantization using median cut algorithm.
  	 * colors must be between 2 and 256.
  	 * Note that support for the resulting palette image is highly experimental at this point;
  	 * only toGray() and toBuffer('png') are guaranteed to work.
  	 */
  def medianCutQuant(colors: Double): Image = js.native
  /**
  	 * Color image quantization using an octree based algorithm.
  	 * colors must be between 2 and 256.
  	 * Note that support for the resulting palette image is highly experimental at this point;
  	 * only toGray() and toBuffer('png') are guaranteed to work.
  	 */
  def octreeColorQuant(colors: Double): Image = js.native
  /**
  	 * Applies an Open Filter and returns the result.
  	 */
  def open(width: Double, height: Double): Image = js.native
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
    tileWidth: Double,
    tileHeight: Double,
    smoothWidth: Double,
    smoothHeight: Double,
    scoreFactor: Double
  ): Image = js.native
  /**
  	 * Computes the horizontal or vertical projection of an 1bpp or 8bpp image.
  	 */
  @JSName("projection")
  def projection_horizontal(mode: horizontal): js.Array[Double] = js.native
  @JSName("projection")
  def projection_vertical(mode: vertical): js.Array[Double] = js.native
  /**
  	 * Applies a rank (0.0 ... 1.0) filter of the specified width
  	 * and height (think of it as radius) to this image
  	 * and returns the result.
  	 * If you set rank to 0.5 you'll get a Median Filter.
  	 * Note that this type of filter works best with odd sizes like 3 or 5.
  	 */
  def rankFilter(width: Double, height: Double, rank: Double): Image = js.native
  /**
  	 * Rotates the image around its center by the specified angle in degrees.
  	 */
  def rotate(angle: Double): Image = js.native
  /**
  	 * Scales an image by scaleX and scaleY (1.0 = 100%).
  	 */
  def scale(scaleX: Double, scaleY: Double): Image = js.native
  /**
  	 * Scales an image proportionally by scale (1.0 = 100%).
  	 */
  def scale(scale: Double): Image = js.native
  /**
  	 * Sets the specified value to each pixel set in the mask.
  	 */
  def setMasked(mask: Image, value: Double): Image = js.native
  /**
  	 * If the images are monochrome, dispatches to Leptonica's pixSubtract and is equivalent to a.and(b.invert()).
  	 * For grayscale images, returns the pixelwise subtraction of b from a, clipped at zero.
  	 * For color, the entire RGB value is subtracted instead of doing channelwise subtraction (ask Leptonica why).
  	 * @example:
  	 * redness = colorImage.toGray(1, 0, 0).subtract(colorImage.toGray(0, 0.5, 0.5))
  	 */
  def subtract(otherImage: Image): Image = js.native
  @JSName("thin")
  def thin_bg(`type`: bg, connectivity: Double, maxIterations: Double): Image = js.native
  /**
  	 * Applies morphological thinning of type (fg or bg) with the specified connectivitiy (4 or 8) and maxIterations (0 to iterate until complete).
  	 */
  @JSName("thin")
  def thin_fg(`type`: fg, connectivity: Double, maxIterations: Double): Image = js.native
  /**
  	 * Converts a grayscale image to monochrome using a global threshold. value must be between 0 and 255.
  	 */
  def threshold(value: Double): Image = js.native
  /**
  	 * Converts the Image in the specified format to a buffer.
  	 * Specifying raw returns the raw image data as buffer.
  	 * For color images, the result contains three bytes per pixel in the order R, G, B;
  	 * for grayscale and monochrome images, it contains one byte per pixel.
  	 * Specifying png returns a PNG encoded image as buffer.
  	 * Specifying jpg returns a JPG encoded image as buffer.
  	 */
  def toBuffer(): Buffer = js.native
  @JSName("toBuffer")
  def toBuffer_jpg(format: jpg): Buffer = js.native
  @JSName("toBuffer")
  def toBuffer_png(format: png): Buffer = js.native
  @JSName("toBuffer")
  def toBuffer_raw(format: raw): Buffer = js.native
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
  def toGray(redWeight: Double, greenWeight: Double, blueWeight: Double): Image = js.native
  @JSName("toGray")
  def toGray_max(selector: max): Image = js.native
  /**
  	 * Converts an RGB image to grayscale by selecting either the 'min' or 'max' channel.
  	 * This can act as a simple color filter: 'max' maps colored pixels towards white,
  	 * while 'min' maps colored pixels towards black.
  	 */
  @JSName("toGray")
  def toGray_min(selector: min): Image = js.native
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
  def unsharp(halfWidth: Double, fraction: Double): Image = js.native
  /**
  	 * Returns the (boolean) exclusive disjunction of two images with equal depth, aligning them to the upper left corner.
  	 */
  def xor(otherImage: Image): Image = js.native
}

