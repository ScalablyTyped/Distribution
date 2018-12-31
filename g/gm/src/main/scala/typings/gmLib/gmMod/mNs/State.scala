package typings
package gmLib.gmMod.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  // Image Operations
  def adjoin(): State = js.native
  def affine(matrix: java.lang.String): State = js.native
  def antialias(enable: scala.Boolean): State = js.native
  def append(image: java.lang.String): State = js.native
  def append(image: java.lang.String, ltr: scala.Boolean): State = js.native
  def authenticate(password: java.lang.String): State = js.native
  def autoOrient(): State = js.native
  def backdrop(): State = js.native
  def background(color: java.lang.String): State = js.native
  def bitdepth(bits: scala.Double): State = js.native
  def blackThreshold(intensity: scala.Double): State = js.native
  def blackThreshold(red: scala.Double, green: scala.Double, blue: scala.Double): State = js.native
  def blackThreshold(red: scala.Double, green: scala.Double, blue: scala.Double, opacity: scala.Double): State = js.native
  def bluePrimary(x: scala.Double, y: scala.Double): State = js.native
  def blur(radius: scala.Double): State = js.native
  def blur(radius: scala.Double, sigma: scala.Double): State = js.native
  def border(width: scala.Double, height: scala.Double): State = js.native
  def borderColor(color: java.lang.String): State = js.native
  def box(color: java.lang.String): State = js.native
  def channel(`type`: NamedColor): State = js.native
  def channel(`type`: java.lang.String): State = js.native
  def charcoal(factor: scala.Double): State = js.native
  def chop(width: scala.Double, height: scala.Double): State = js.native
  def chop(width: scala.Double, height: scala.Double, x: scala.Double): State = js.native
  def chop(width: scala.Double, height: scala.Double, x: scala.Double, y: scala.Double): State = js.native
  def clip(): State = js.native
  def coalesce(): State = js.native
  // Getters
  def color(callback: GetterCallback[scala.Double]): State = js.native
  def color(opts: GetterOptions, callback: GetterCallback[scala.Double]): State = js.native
  def colorMap(`type`: java.lang.String): State = js.native
  @JSName("colorMap")
  def colorMap_private(`type`: gmLib.gmLibStrings.`private`): State = js.native
  @JSName("colorMap")
  def colorMap_shared(`type`: gmLib.gmLibStrings.shared): State = js.native
  def colorize(red: scala.Double, green: scala.Double, blue: scala.Double): State = js.native
  def colors(colors: scala.Double): State = js.native
  def colorspace(space: ColorSpace): State = js.native
  def colorspace(space: java.lang.String): State = js.native
  def command(customCommand: java.lang.String): State = js.native
  def compose(operator: ComposeOperator): State = js.native
  def compose(operator: java.lang.String): State = js.native
  def compress(`type`: CompressionType): State = js.native
  def compress(`type`: java.lang.String): State = js.native
  def contrast(multiplier: scala.Double): State = js.native
  def convolve(kernel: java.lang.String): State = js.native
  def createDirectories(): State = js.native
  def crop(width: scala.Double, height: scala.Double): State = js.native
  def crop(width: scala.Double, height: scala.Double, x: scala.Double): State = js.native
  def crop(width: scala.Double, height: scala.Double, x: scala.Double, y: scala.Double): State = js.native
  def crop(
    width: scala.Double,
    height: scala.Double,
    x: scala.Double,
    y: scala.Double,
    percent: scala.Boolean
  ): State = js.native
  def cycle(amount: scala.Double): State = js.native
  def deconstruct(): State = js.native
  def define(value: java.lang.String): State = js.native
  def delay(milliseconds: scala.Double): State = js.native
  def density(width: scala.Double, height: scala.Double): State = js.native
  def depth(callback: GetterCallback[scala.Double]): State = js.native
  def depth(opts: GetterOptions, callback: GetterCallback[scala.Double]): State = js.native
  def despeckle(): State = js.native
  def displace(horizontal: scala.Double, vertical: scala.Double): State = js.native
  def display(xServer: java.lang.String): State = js.native
  def dispose(method: DisposeMethod): State = js.native
  def dispose(method: java.lang.String): State = js.native
  def dissolve(percent: scala.Double): State = js.native
  def dither(): State = js.native
  def dither(enable: scala.Boolean): State = js.native
  // Drawing Operations
  def draw(args: java.lang.String): State = js.native
  def drawArc(
    x0: scala.Double,
    y0: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    r0: scala.Double,
    r1: scala.Double
  ): State = js.native
  def drawBezier(
    coord0: js.Tuple2[scala.Double, scala.Double],
    coord1: js.Tuple2[scala.Double, scala.Double],
    coords: (js.Tuple2[scala.Double, scala.Double])*
  ): State = js.native
  def drawCircle(x0: scala.Double, y0: scala.Double, x1: scala.Double, y1: scala.Double): State = js.native
  def drawEllipse(
    x0: scala.Double,
    y0: scala.Double,
    rx: scala.Double,
    ry: scala.Double,
    a0: scala.Double,
    a1: scala.Double
  ): State = js.native
  def drawLine(x0: scala.Double, y0: scala.Double, x1: scala.Double, y1: scala.Double): State = js.native
  def drawPoint(x: scala.Double, y: scala.Double): State = js.native
  def drawPolygon(
    coord0: js.Tuple2[scala.Double, scala.Double],
    coord1: js.Tuple2[scala.Double, scala.Double],
    coord2: js.Tuple2[scala.Double, scala.Double],
    coords: (js.Tuple2[scala.Double, scala.Double])*
  ): State = js.native
  def drawPolyline(
    coord0: js.Tuple2[scala.Double, scala.Double],
    coord1: js.Tuple2[scala.Double, scala.Double],
    coord2: js.Tuple2[scala.Double, scala.Double],
    coords: (js.Tuple2[scala.Double, scala.Double])*
  ): State = js.native
  def drawRectangle(x0: scala.Double, y0: scala.Double, x1: scala.Double, y1: scala.Double): State = js.native
  def drawRectangle(x0: scala.Double, y0: scala.Double, x1: scala.Double, y1: scala.Double, wc: scala.Double): State = js.native
  def drawRectangle(
    x0: scala.Double,
    y0: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    wc: scala.Double,
    hc: scala.Double
  ): State = js.native
  def drawText(x: scala.Double, y: scala.Double, text: java.lang.String): State = js.native
  def drawText(x: scala.Double, y: scala.Double, text: java.lang.String, gravity: GravityDirection): State = js.native
  def drawText(x: scala.Double, y: scala.Double, text: java.lang.String, gravity: java.lang.String): State = js.native
  def edge(): State = js.native
  def edge(radius: scala.Double): State = js.native
  def emboss(): State = js.native
  def emboss(radius: scala.Double): State = js.native
  def encoding(encoding: Encoding): State = js.native
  def encoding(encoding: java.lang.String): State = js.native
  def endian(`type`: EndianType): State = js.native
  def endian(`type`: java.lang.String): State = js.native
  def enhance(): State = js.native
  def equalize(): State = js.native
  def extent(width: scala.Double, height: scala.Double): State = js.native
  def extent(width: scala.Double, height: scala.Double, options: java.lang.String): State = js.native
  def file(filename: java.lang.String): State = js.native
  def filesize(callback: GetterCallback[java.lang.String]): State = js.native
  def filesize(opts: GetterOptions, callback: GetterCallback[java.lang.String]): State = js.native
  def fill(color: java.lang.String): State = js.native
  def filter(`type`: FilterType): State = js.native
  def filter(`type`: java.lang.String): State = js.native
  def flatten(): State = js.native
  def flip(): State = js.native
  def flop(): State = js.native
  def font(name: java.lang.String): State = js.native
  def font(name: java.lang.String, size: scala.Double): State = js.native
  def fontSize(size: scala.Double): State = js.native
  def foreground(color: java.lang.String): State = js.native
  def format(callback: GetterCallback[java.lang.String]): State = js.native
  def format(opts: GetterOptions, callback: GetterCallback[java.lang.String]): State = js.native
  def frame(
    width: scala.Double,
    height: scala.Double,
    outerBevelWidth: scala.Double,
    outBevelHeight: scala.Double
  ): State = js.native
  def fuzz(distance: scala.Double): State = js.native
  def fuzz(distance: scala.Double, percent: scala.Boolean): State = js.native
  def gamma(r: scala.Double, g: scala.Double, b: scala.Double): State = js.native
  def gaussian(radius: scala.Double): State = js.native
  def gaussian(radius: scala.Double, sigma: scala.Double): State = js.native
  def geometry(geometry: java.lang.String): State = js.native
  def geometry(width: scala.Double): State = js.native
  def geometry(width: scala.Double, height: scala.Double): State = js.native
  def geometry(width: scala.Double, height: scala.Double, option: ResizeOption): State = js.native
  def gravity(direction: GravityDirection): State = js.native
  def gravity(direction: java.lang.String): State = js.native
  def greenPrimary(x: scala.Double, y: scala.Double): State = js.native
  def highlightColor(color: java.lang.String): State = js.native
  def highlightStyle(style: HighlightStyle): State = js.native
  def highlightStyle(style: java.lang.String): State = js.native
  def iconGeometry(geometry: java.lang.String): State = js.native
  def identify(callback: GetterCallback[ImageInfo]): State = js.native
  def identify(opts: GetterOptions, callback: GetterCallback[ImageInfo]): State = js.native
  def implode(): State = js.native
  def implode(factor: scala.Double): State = js.native
  def in(customArguments: java.lang.String*): State = js.native
  def intent(`type`: IntentType): State = js.native
  def intent(`type`: java.lang.String): State = js.native
  def interlace(`type`: InterlaceType): State = js.native
  def interlace(`type`: java.lang.String): State = js.native
  def label(name: java.lang.String): State = js.native
  def lat(width: scala.Double, height: scala.Double, offset: scala.Double): State = js.native
  def lat(width: scala.Double, height: scala.Double, offset: scala.Double, percent: scala.Boolean): State = js.native
  def level(blackPoint: scala.Double, gamma: scala.Double, whitePoint: scala.Double): State = js.native
  def level(blackPoint: scala.Double, gamma: scala.Double, whitePoint: scala.Double, percent: scala.Boolean): State = js.native
  def limit(`type`: LimitType, `val`: java.lang.String): State = js.native
  def limit(`type`: java.lang.String, `val`: java.lang.String): State = js.native
  def list(`type`: ListType): State = js.native
  def list(`type`: java.lang.String): State = js.native
  def log(format: java.lang.String): State = js.native
  def loop(iterations: scala.Double): State = js.native
  def lower(width: scala.Double, height: scala.Double): State = js.native
  def magnify(factor: scala.Double): State = js.native
  def map(filename: java.lang.String): State = js.native
  def mask(filename: java.lang.String): State = js.native
  def matte(): State = js.native
  def matteColor(color: java.lang.String): State = js.native
  def maximumError(limit: scala.Double): State = js.native
  def median(): State = js.native
  def median(radius: scala.Double): State = js.native
  def minify(factor: scala.Double): State = js.native
  def mode(mode: OperationMode): State = js.native
  def mode(mode: java.lang.String): State = js.native
  def modulate(b: scala.Double, s: scala.Double, h: scala.Double): State = js.native
  def monitor(): State = js.native
  def monochrome(): State = js.native
  def morph(otherImg: java.lang.String, outName: java.lang.String): State = js.native
  def morph(otherImg: java.lang.String, outName: java.lang.String, callback: WriteCallback): State = js.native
  def morph(otherImg: js.Array[java.lang.String], outName: java.lang.String): State = js.native
  def morph(otherImg: js.Array[java.lang.String], outName: java.lang.String, callback: WriteCallback): State = js.native
  def mosaic(): State = js.native
  def motionBlur(radius: scala.Double): State = js.native
  def motionBlur(radius: scala.Double, sigma: scala.Double): State = js.native
  def motionBlur(radius: scala.Double, sigma: scala.Double, angle: scala.Double): State = js.native
  def name(): State = js.native
  def negative(): State = js.native
  def noProfile(): State = js.native
  def noise(`type`: NoiseType): State = js.native
  def noise(`type`: java.lang.String): State = js.native
  def noise(`type`: scala.Double): State = js.native
  def noop(): State = js.native
  def normalize(): State = js.native
  def opaque(color: java.lang.String): State = js.native
  def operator(channel: java.lang.String, operator: ChannelOperator, rvalue: scala.Double): State = js.native
  def operator(channel: java.lang.String, operator: ChannelOperator, rvalue: scala.Double, percent: scala.Boolean): State = js.native
  def operator(channel: java.lang.String, operator: java.lang.String, rvalue: scala.Double): State = js.native
  def operator(
    channel: java.lang.String,
    operator: java.lang.String,
    rvalue: scala.Double,
    percent: scala.Boolean
  ): State = js.native
  def orderedDither(channelType: ChannelType, NxN: java.lang.String): State = js.native
  def orderedDither(channelType: java.lang.String, NxN: java.lang.String): State = js.native
  def orientation(callback: GetterCallback[java.lang.String]): State = js.native
  def orientation(opts: GetterOptions, callback: GetterCallback[java.lang.String]): State = js.native
  def out(customArguments: java.lang.String*): State = js.native
  def outputDirectory(directory: java.lang.String): State = js.native
  def page(width: scala.Double, height: scala.Double): State = js.native
  def page(width: scala.Double, height: scala.Double, arg: java.lang.String): State = js.native
  @JSName("page")
  def `page_!`(width: scala.Double, height: scala.Double, arg: gmLib.gmLibStrings.`!`): State = js.native
  @JSName("page")
  def `page_%`(width: scala.Double, height: scala.Double, arg: gmLib.gmLibStrings.`%`): State = js.native
  @JSName("page")
  def `page_<`(width: scala.Double, height: scala.Double, arg: gmLib.gmLibStrings.`<`): State = js.native
  @JSName("page")
  def `page_>`(width: scala.Double, height: scala.Double, arg: gmLib.gmLibStrings.`>`): State = js.native
  def paint(radius: scala.Double): State = js.native
  def pause(seconds: scala.Double): State = js.native
  def pen(color: java.lang.String): State = js.native
  def ping(): State = js.native
  def pointSize(size: scala.Double): State = js.native
  def preview(`type`: PreviewType): State = js.native
  def preview(`type`: java.lang.String): State = js.native
  def process(command: java.lang.String): State = js.native
  def profile(filename: java.lang.String): State = js.native
  def progress(): State = js.native
  def quality(level: scala.Double): State = js.native
  def raise(width: scala.Double, height: scala.Double): State = js.native
  def randomThreshold(channelType: ChannelType, LOWxHIGH: java.lang.String): State = js.native
  def rawSize(width: scala.Double, height: scala.Double): State = js.native
  def rawSize(width: scala.Double, height: scala.Double, offset: scala.Double): State = js.native
  def recolor(matrix: java.lang.String): State = js.native
  def redPrimary(x: scala.Double, y: scala.Double): State = js.native
  def region(width: scala.Double, height: scala.Double): State = js.native
  def region(width: scala.Double, height: scala.Double, x: scala.Double): State = js.native
  def region(width: scala.Double, height: scala.Double, x: scala.Double, y: scala.Double): State = js.native
  def remote(): State = js.native
  def render(): State = js.native
  def repage(reset: java.lang.String): State = js.native
  def repage(width: scala.Double, height: scala.Double, xoff: scala.Double, yoff: scala.Double): State = js.native
  def repage(
    width: scala.Double,
    height: scala.Double,
    xoff: scala.Double,
    yoff: scala.Double,
    arg: java.lang.String
  ): State = js.native
  @JSName("repage")
  def `repage_+`(reset: gmLib.gmLibStrings.`+`): State = js.native
  def res(callback: GetterCallback[java.lang.String]): State = js.native
  def res(opts: GetterOptions, callback: GetterCallback[java.lang.String]): State = js.native
  def resample(horizontal: scala.Double, vertical: scala.Double): State = js.native
  def resize(width: scala.Double): State = js.native
  def resize(width: scala.Double, height: scala.Double): State = js.native
  def resize(width: scala.Double, height: scala.Double, option: ResizeOption): State = js.native
  def roll(horizontal: scala.Double, vertical: scala.Double): State = js.native
  def rotate(backgroundColor: java.lang.String, degrees: scala.Double): State = js.native
  def sample(geometry: java.lang.String): State = js.native
  def samplingFactor(horizontalFactor: scala.Double, verticalFactor: scala.Double): State = js.native
  def scale(width: scala.Double, height: scala.Double): State = js.native
  def scene(index: scala.Double): State = js.native
  def scenes(start: scala.Double, end: scala.Double): State = js.native
  def screen(): State = js.native
  def segment(clustherThreshold: scala.Double, smoothingThreshold: scala.Double): State = js.native
  def sepia(): State = js.native
  def set(attribute: java.lang.String, value: java.lang.String): State = js.native
  def setDraw(property: SetDrawProperty, x: scala.Double, y: scala.Double, method: SetDrawMethod): State = js.native
  def setDraw(property: SetDrawProperty, x: scala.Double, y: scala.Double, method: java.lang.String): State = js.native
  def setDraw(property: java.lang.String, x: scala.Double, y: scala.Double, method: SetDrawMethod): State = js.native
  def setDraw(property: java.lang.String, x: scala.Double, y: scala.Double, method: java.lang.String): State = js.native
  def setFormat(format: java.lang.String): State = js.native
  def shade(azimuth: scala.Double, elevation: scala.Double): State = js.native
  def shadow(radius: scala.Double): State = js.native
  def shadow(radius: scala.Double, sigma: scala.Double): State = js.native
  def sharedMemory(): State = js.native
  def sharpen(radius: scala.Double): State = js.native
  def sharpen(radius: scala.Double, sigma: scala.Double): State = js.native
  def shave(width: scala.Double, height: scala.Double): State = js.native
  def shave(width: scala.Double, height: scala.Double, percent: scala.Boolean): State = js.native
  def shear(xDegrees: scala.Double, yDegress: scala.Double): State = js.native
  def silent(): State = js.native
  def size(callback: GetterCallback[Dimensions]): State = js.native
  def size(opts: GetterOptions, callback: GetterCallback[Dimensions]): State = js.native
  def snaps(count: scala.Double): State = js.native
  def solarize(threshold: scala.Double): State = js.native
  def spread(amount: scala.Double): State = js.native
  def stegano(offset: scala.Double): State = js.native
  def stereo(): State = js.native
  // Commands
  def stream(): nodeLib.streamMod.PassThrough = js.native
  def stream(callback: WriteCallback): nodeLib.streamMod.PassThrough = js.native
  def stream(format: java.lang.String): nodeLib.streamMod.PassThrough = js.native
  def stream(format: java.lang.String, callback: WriteCallback): nodeLib.streamMod.PassThrough = js.native
  def strip(): State = js.native
  def stroke(color: java.lang.String): State = js.native
  def stroke(color: java.lang.String, width: scala.Double): State = js.native
  def strokeWidth(width: scala.Double): State = js.native
  def swirl(degrees: scala.Double): State = js.native
  def textFont(font: java.lang.String): State = js.native
  def threshold(value: scala.Double): State = js.native
  def threshold(value: scala.Double, percent: scala.Boolean): State = js.native
  def thumb(width: scala.Double, height: scala.Double, outName: java.lang.String, callback: WriteCallback): State = js.native
  def thumb(
    width: scala.Double,
    height: scala.Double,
    outName: java.lang.String,
    quality: scala.Double,
    align: java.lang.String,
    callback: WriteCallback
  ): State = js.native
  def thumb(
    width: scala.Double,
    height: scala.Double,
    outName: java.lang.String,
    quality: scala.Double,
    callback: WriteCallback
  ): State = js.native
  @JSName("thumb")
  def thumb_center(
    width: scala.Double,
    height: scala.Double,
    outName: java.lang.String,
    quality: scala.Double,
    align: gmLib.gmLibStrings.center,
    callback: WriteCallback
  ): State = js.native
  @JSName("thumb")
  def thumb_topleft(
    width: scala.Double,
    height: scala.Double,
    outName: java.lang.String,
    quality: scala.Double,
    align: gmLib.gmLibStrings.topleft,
    callback: WriteCallback
  ): State = js.native
  def tile(filename: java.lang.String): State = js.native
  def title(title: java.lang.String): State = js.native
  def toBuffer(callback: js.Function2[/* err */ nodeLib.Error, /* buffer */ nodeLib.Buffer, _]): nodeLib.streamMod.PassThrough = js.native
  def toBuffer(
    format: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* buffer */ nodeLib.Buffer, _]
  ): nodeLib.streamMod.PassThrough = js.native
  def transform(color: java.lang.String): State = js.native
  def transparent(color: java.lang.String): State = js.native
  def treeDepth(depth: scala.Double): State = js.native
  def trim(): State = js.native
  def `type`(`type`: ImageType): State = js.native
  def `type`(`type`: java.lang.String): State = js.native
  def units(`type`: UnitType): State = js.native
  def units(`type`: java.lang.String): State = js.native
  def unsharp(radius: scala.Double): State = js.native
  def unsharp(radius: scala.Double, sigma: scala.Double): State = js.native
  def unsharp(radius: scala.Double, sigma: scala.Double, amount: scala.Double): State = js.native
  def unsharp(radius: scala.Double, sigma: scala.Double, amount: scala.Double, threshold: scala.Double): State = js.native
  def update(seconds: scala.Double): State = js.native
  def usePixmap(): State = js.native
  def view(): State = js.native
  def virtualPixel(method: VirtualPixelMethod): State = js.native
  def virtualPixel(method: java.lang.String): State = js.native
  def visual(`type`: VisualType): State = js.native
  def visual(`type`: java.lang.String): State = js.native
  def watermark(brightness: scala.Double, saturation: scala.Double): State = js.native
  def wave(amplitude: scala.Double, wavelength: scala.Double): State = js.native
  def whitePoint(x: scala.Double, y: scala.Double): State = js.native
  def whiteThreshold(intensity: scala.Double): State = js.native
  def whiteThreshold(red: scala.Double, green: scala.Double, blue: scala.Double): State = js.native
  def whiteThreshold(red: scala.Double, green: scala.Double, blue: scala.Double, opacity: scala.Double): State = js.native
  def window(id: java.lang.String): State = js.native
  def windowGroup(): State = js.native
  def write(filename: java.lang.String, callback: WriteCallback): scala.Unit = js.native
}

