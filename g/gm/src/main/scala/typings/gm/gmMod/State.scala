package typings.gm.gmMod

import typings.gm.gmStrings.`!`
import typings.gm.gmStrings.`%`
import typings.gm.gmStrings.`+`
import typings.gm.gmStrings.`<`
import typings.gm.gmStrings.`>`
import typings.gm.gmStrings.`private`
import typings.gm.gmStrings.center
import typings.gm.gmStrings.shared
import typings.gm.gmStrings.topleft
import typings.node.Buffer
import typings.node.streamMod.PassThrough
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  // Image Operations
  def adjoin(): State = js.native
  def affine(matrix: String): State = js.native
  def antialias(enable: Boolean): State = js.native
  def append(image: String): State = js.native
  def append(image: String, ltr: Boolean): State = js.native
  def authenticate(password: String): State = js.native
  def autoOrient(): State = js.native
  def backdrop(): State = js.native
  def background(color: String): State = js.native
  def bitdepth(bits: Double): State = js.native
  def blackThreshold(intensity: Double): State = js.native
  def blackThreshold(red: Double, green: Double, blue: Double): State = js.native
  def blackThreshold(red: Double, green: Double, blue: Double, opacity: Double): State = js.native
  def bluePrimary(x: Double, y: Double): State = js.native
  def blur(radius: Double): State = js.native
  def blur(radius: Double, sigma: Double): State = js.native
  def border(width: Double, height: Double): State = js.native
  def borderColor(color: String): State = js.native
  def box(color: String): State = js.native
  def channel(`type`: String): State = js.native
  def channel(`type`: NamedColor): State = js.native
  def charcoal(factor: Double): State = js.native
  def chop(width: Double, height: Double): State = js.native
  def chop(width: Double, height: Double, x: Double): State = js.native
  def chop(width: Double, height: Double, x: Double, y: Double): State = js.native
  def clip(): State = js.native
  def coalesce(): State = js.native
  // Getters
  def color(callback: GetterCallback[Double]): State = js.native
  def color(opts: GetterOptions, callback: GetterCallback[Double]): State = js.native
  def colorMap(`type`: String): State = js.native
  @JSName("colorMap")
  def colorMap_private(`type`: `private`): State = js.native
  @JSName("colorMap")
  def colorMap_shared(`type`: shared): State = js.native
  def colorize(red: Double, green: Double, blue: Double): State = js.native
  def colors(colors: Double): State = js.native
  def colorspace(space: String): State = js.native
  def colorspace(space: ColorSpace): State = js.native
  def command(customCommand: String): State = js.native
  def compose(operator: String): State = js.native
  def compose(operator: ComposeOperator): State = js.native
  def compress(`type`: String): State = js.native
  def compress(`type`: CompressionType): State = js.native
  def contrast(multiplier: Double): State = js.native
  def convolve(kernel: String): State = js.native
  def createDirectories(): State = js.native
  def crop(width: Double, height: Double): State = js.native
  def crop(width: Double, height: Double, x: Double): State = js.native
  def crop(width: Double, height: Double, x: Double, y: Double): State = js.native
  def crop(width: Double, height: Double, x: Double, y: Double, percent: Boolean): State = js.native
  def cycle(amount: Double): State = js.native
  def deconstruct(): State = js.native
  def define(value: String): State = js.native
  def delay(milliseconds: Double): State = js.native
  def density(width: Double, height: Double): State = js.native
  def depth(callback: GetterCallback[Double]): State = js.native
  def depth(opts: GetterOptions, callback: GetterCallback[Double]): State = js.native
  def despeckle(): State = js.native
  def displace(horizontal: Double, vertical: Double): State = js.native
  def display(xServer: String): State = js.native
  def dispose(method: String): State = js.native
  def dispose(method: DisposeMethod): State = js.native
  def dissolve(percent: Double): State = js.native
  def dither(): State = js.native
  def dither(enable: Boolean): State = js.native
  // Drawing Operations
  def draw(args: String): State = js.native
  def drawArc(x0: Double, y0: Double, x1: Double, y1: Double, r0: Double, r1: Double): State = js.native
  def drawBezier(
    coord0: js.Tuple2[Double, Double],
    coord1: js.Tuple2[Double, Double],
    coords: (js.Tuple2[Double, Double])*
  ): State = js.native
  def drawCircle(x0: Double, y0: Double, x1: Double, y1: Double): State = js.native
  def drawEllipse(x0: Double, y0: Double, rx: Double, ry: Double, a0: Double, a1: Double): State = js.native
  def drawLine(x0: Double, y0: Double, x1: Double, y1: Double): State = js.native
  def drawPoint(x: Double, y: Double): State = js.native
  def drawPolygon(
    coord0: js.Tuple2[Double, Double],
    coord1: js.Tuple2[Double, Double],
    coord2: js.Tuple2[Double, Double],
    coords: (js.Tuple2[Double, Double])*
  ): State = js.native
  def drawPolyline(
    coord0: js.Tuple2[Double, Double],
    coord1: js.Tuple2[Double, Double],
    coord2: js.Tuple2[Double, Double],
    coords: (js.Tuple2[Double, Double])*
  ): State = js.native
  def drawRectangle(x0: Double, y0: Double, x1: Double, y1: Double): State = js.native
  def drawRectangle(x0: Double, y0: Double, x1: Double, y1: Double, wc: Double): State = js.native
  def drawRectangle(x0: Double, y0: Double, x1: Double, y1: Double, wc: Double, hc: Double): State = js.native
  def drawText(x: Double, y: Double, text: String): State = js.native
  def drawText(x: Double, y: Double, text: String, gravity: String): State = js.native
  def drawText(x: Double, y: Double, text: String, gravity: GravityDirection): State = js.native
  def edge(): State = js.native
  def edge(radius: Double): State = js.native
  def emboss(): State = js.native
  def emboss(radius: Double): State = js.native
  def encoding(encoding: String): State = js.native
  def encoding(encoding: Encoding): State = js.native
  def endian(`type`: String): State = js.native
  def endian(`type`: EndianType): State = js.native
  def enhance(): State = js.native
  def equalize(): State = js.native
  def extent(width: Double, height: Double): State = js.native
  def extent(width: Double, height: Double, options: String): State = js.native
  def file(filename: String): State = js.native
  def filesize(callback: GetterCallback[String]): State = js.native
  def filesize(opts: GetterOptions, callback: GetterCallback[String]): State = js.native
  def fill(color: String): State = js.native
  def filter(`type`: String): State = js.native
  def filter(`type`: FilterType): State = js.native
  def flatten(): State = js.native
  def flip(): State = js.native
  def flop(): State = js.native
  def font(name: String): State = js.native
  def font(name: String, size: Double): State = js.native
  def fontSize(size: Double): State = js.native
  def foreground(color: String): State = js.native
  def format(callback: GetterCallback[String]): State = js.native
  def format(opts: GetterOptions, callback: GetterCallback[String]): State = js.native
  def frame(width: Double, height: Double, outerBevelWidth: Double, outBevelHeight: Double): State = js.native
  def fuzz(distance: Double): State = js.native
  def fuzz(distance: Double, percent: Boolean): State = js.native
  def gamma(r: Double, g: Double, b: Double): State = js.native
  def gaussian(radius: Double): State = js.native
  def gaussian(radius: Double, sigma: Double): State = js.native
  def geometry(geometry: String): State = js.native
  def geometry(width: Double): State = js.native
  def geometry(width: Double, height: Double): State = js.native
  def geometry(width: Double, height: Double, option: ResizeOption): State = js.native
  def gravity(direction: String): State = js.native
  def gravity(direction: GravityDirection): State = js.native
  def greenPrimary(x: Double, y: Double): State = js.native
  def highlightColor(color: String): State = js.native
  def highlightStyle(style: String): State = js.native
  def highlightStyle(style: HighlightStyle): State = js.native
  def iconGeometry(geometry: String): State = js.native
  def identify(callback: GetterCallback[ImageInfo]): State = js.native
  def identify(format: String, callback: GetterCallback[String]): State = js.native
  def identify(opts: GetterOptions, callback: GetterCallback[ImageInfo]): State = js.native
  def implode(): State = js.native
  def implode(factor: Double): State = js.native
  def in(customArguments: String*): State = js.native
  def intent(`type`: String): State = js.native
  def intent(`type`: IntentType): State = js.native
  def interlace(`type`: String): State = js.native
  def interlace(`type`: InterlaceType): State = js.native
  def label(name: String): State = js.native
  def lat(width: Double, height: Double, offset: Double): State = js.native
  def lat(width: Double, height: Double, offset: Double, percent: Boolean): State = js.native
  def level(blackPoint: Double, gamma: Double, whitePoint: Double): State = js.native
  def level(blackPoint: Double, gamma: Double, whitePoint: Double, percent: Boolean): State = js.native
  def limit(`type`: String, `val`: String): State = js.native
  def limit(`type`: LimitType, `val`: String): State = js.native
  def list(`type`: String): State = js.native
  def list(`type`: ListType): State = js.native
  def log(format: String): State = js.native
  def loop(iterations: Double): State = js.native
  def lower(width: Double, height: Double): State = js.native
  def magnify(factor: Double): State = js.native
  def map(filename: String): State = js.native
  def mask(filename: String): State = js.native
  def matte(): State = js.native
  def matteColor(color: String): State = js.native
  def maximumError(limit: Double): State = js.native
  def median(): State = js.native
  def median(radius: Double): State = js.native
  def minify(factor: Double): State = js.native
  def mode(mode: String): State = js.native
  def mode(mode: OperationMode): State = js.native
  def modulate(b: Double, s: Double, h: Double): State = js.native
  def monitor(): State = js.native
  def monochrome(): State = js.native
  def morph(otherImg: String, outName: String): State = js.native
  def morph(otherImg: String, outName: String, callback: WriteCallback): State = js.native
  def morph(otherImg: js.Array[String], outName: String): State = js.native
  def morph(otherImg: js.Array[String], outName: String, callback: WriteCallback): State = js.native
  def mosaic(): State = js.native
  def motionBlur(radius: Double): State = js.native
  def motionBlur(radius: Double, sigma: Double): State = js.native
  def motionBlur(radius: Double, sigma: Double, angle: Double): State = js.native
  def name(): State = js.native
  def negative(): State = js.native
  def noProfile(): State = js.native
  def noise(`type`: String): State = js.native
  def noise(`type`: Double): State = js.native
  def noise(`type`: NoiseType): State = js.native
  def noop(): State = js.native
  def normalize(): State = js.native
  def opaque(color: String): State = js.native
  def operator(channel: String, operator: String, rvalue: Double): State = js.native
  def operator(channel: String, operator: String, rvalue: Double, percent: Boolean): State = js.native
  def operator(channel: String, operator: ChannelOperator, rvalue: Double): State = js.native
  def operator(channel: String, operator: ChannelOperator, rvalue: Double, percent: Boolean): State = js.native
  def orderedDither(channelType: String, NxN: String): State = js.native
  def orderedDither(channelType: ChannelType, NxN: String): State = js.native
  def orientation(callback: GetterCallback[String]): State = js.native
  def orientation(opts: GetterOptions, callback: GetterCallback[String]): State = js.native
  def out(customArguments: String*): State = js.native
  def outputDirectory(directory: String): State = js.native
  def page(width: Double, height: Double): State = js.native
  def page(width: Double, height: Double, arg: String): State = js.native
  def page(width: Double, height: Double, arg: `!`): State = js.native
  def page(width: Double, height: Double, arg: `%`): State = js.native
  def page(width: Double, height: Double, arg: `<`): State = js.native
  def page(width: Double, height: Double, arg: `>`): State = js.native
  def paint(radius: Double): State = js.native
  def pause(seconds: Double): State = js.native
  def pen(color: String): State = js.native
  def ping(): State = js.native
  def pointSize(size: Double): State = js.native
  def preview(`type`: String): State = js.native
  def preview(`type`: PreviewType): State = js.native
  def process(command: String): State = js.native
  def profile(filename: String): State = js.native
  def progress(): State = js.native
  def quality(level: Double): State = js.native
  def raise(width: Double, height: Double): State = js.native
  def randomThreshold(channelType: ChannelType, LOWxHIGH: String): State = js.native
  def rawSize(width: Double, height: Double): State = js.native
  def rawSize(width: Double, height: Double, offset: Double): State = js.native
  def recolor(matrix: String): State = js.native
  def redPrimary(x: Double, y: Double): State = js.native
  def region(width: Double, height: Double): State = js.native
  def region(width: Double, height: Double, x: Double): State = js.native
  def region(width: Double, height: Double, x: Double, y: Double): State = js.native
  def remote(): State = js.native
  def render(): State = js.native
  def repage(reset: String): State = js.native
  def repage(reset: `+`): State = js.native
  def repage(width: Double, height: Double, xoff: Double, yoff: Double): State = js.native
  def repage(width: Double, height: Double, xoff: Double, yoff: Double, arg: String): State = js.native
  def res(callback: GetterCallback[String]): State = js.native
  def res(opts: GetterOptions, callback: GetterCallback[String]): State = js.native
  def resample(horizontal: Double, vertical: Double): State = js.native
  def resize(width: Double): State = js.native
  def resize(width: Double, height: Double): State = js.native
  def resize(width: Double, height: Double, option: ResizeOption): State = js.native
  def roll(horizontal: Double, vertical: Double): State = js.native
  def rotate(backgroundColor: String, degrees: Double): State = js.native
  def sample(geometry: String): State = js.native
  def samplingFactor(horizontalFactor: Double, verticalFactor: Double): State = js.native
  def scale(width: Double, height: Double): State = js.native
  def scene(index: Double): State = js.native
  def scenes(start: Double, end: Double): State = js.native
  def screen(): State = js.native
  def segment(clustherThreshold: Double, smoothingThreshold: Double): State = js.native
  def sepia(): State = js.native
  def set(attribute: String, value: String): State = js.native
  def setDraw(property: String, x: Double, y: Double, method: String): State = js.native
  def setDraw(property: String, x: Double, y: Double, method: SetDrawMethod): State = js.native
  def setDraw(property: SetDrawProperty, x: Double, y: Double, method: String): State = js.native
  def setDraw(property: SetDrawProperty, x: Double, y: Double, method: SetDrawMethod): State = js.native
  def setFormat(format: String): State = js.native
  def shade(azimuth: Double, elevation: Double): State = js.native
  def shadow(radius: Double): State = js.native
  def shadow(radius: Double, sigma: Double): State = js.native
  def sharedMemory(): State = js.native
  def sharpen(radius: Double): State = js.native
  def sharpen(radius: Double, sigma: Double): State = js.native
  def shave(width: Double, height: Double): State = js.native
  def shave(width: Double, height: Double, percent: Boolean): State = js.native
  def shear(xDegrees: Double, yDegress: Double): State = js.native
  def silent(): State = js.native
  def size(callback: GetterCallback[Dimensions]): State = js.native
  def size(opts: GetterOptions, callback: GetterCallback[Dimensions]): State = js.native
  def snaps(count: Double): State = js.native
  def solarize(threshold: Double): State = js.native
  def spread(amount: Double): State = js.native
  def stegano(offset: Double): State = js.native
  def stereo(): State = js.native
  // Commands
  def stream(): PassThrough = js.native
  def stream(callback: WriteCallback): PassThrough = js.native
  def stream(format: String): PassThrough = js.native
  def stream(format: String, callback: WriteCallback): PassThrough = js.native
  def strip(): State = js.native
  def stroke(color: String): State = js.native
  def stroke(color: String, width: Double): State = js.native
  def strokeWidth(width: Double): State = js.native
  def swirl(degrees: Double): State = js.native
  def textFont(font: String): State = js.native
  def threshold(value: Double): State = js.native
  def threshold(value: Double, percent: Boolean): State = js.native
  def thumb(width: Double, height: Double, outName: String, callback: WriteCallback): State = js.native
  def thumb(
    width: Double,
    height: Double,
    outName: String,
    quality: Double,
    align: String,
    callback: WriteCallback
  ): State = js.native
  def thumb(width: Double, height: Double, outName: String, quality: Double, callback: WriteCallback): State = js.native
  @JSName("thumb")
  def thumb_center(
    width: Double,
    height: Double,
    outName: String,
    quality: Double,
    align: center,
    callback: WriteCallback
  ): State = js.native
  @JSName("thumb")
  def thumb_topleft(
    width: Double,
    height: Double,
    outName: String,
    quality: Double,
    align: topleft,
    callback: WriteCallback
  ): State = js.native
  def tile(filename: String): State = js.native
  def title(title: String): State = js.native
  def toBuffer(callback: js.Function2[/* err */ Error | Null, /* buffer */ Buffer, _]): PassThrough = js.native
  def toBuffer(format: String, callback: js.Function2[/* err */ Error | Null, /* buffer */ Buffer, _]): PassThrough = js.native
  def transform(color: String): State = js.native
  def transparent(color: String): State = js.native
  def treeDepth(depth: Double): State = js.native
  def trim(): State = js.native
  def `type`(`type`: String): State = js.native
  def `type`(`type`: ImageType): State = js.native
  def units(`type`: String): State = js.native
  def units(`type`: UnitType): State = js.native
  def unsharp(radius: Double): State = js.native
  def unsharp(radius: Double, sigma: Double): State = js.native
  def unsharp(radius: Double, sigma: Double, amount: Double): State = js.native
  def unsharp(radius: Double, sigma: Double, amount: Double, threshold: Double): State = js.native
  def update(seconds: Double): State = js.native
  def usePixmap(): State = js.native
  def view(): State = js.native
  def virtualPixel(method: String): State = js.native
  def virtualPixel(method: VirtualPixelMethod): State = js.native
  def visual(`type`: String): State = js.native
  def visual(`type`: VisualType): State = js.native
  def watermark(brightness: Double, saturation: Double): State = js.native
  def wave(amplitude: Double, wavelength: Double): State = js.native
  def whitePoint(x: Double, y: Double): State = js.native
  def whiteThreshold(intensity: Double): State = js.native
  def whiteThreshold(red: Double, green: Double, blue: Double): State = js.native
  def whiteThreshold(red: Double, green: Double, blue: Double, opacity: Double): State = js.native
  def window(id: String): State = js.native
  def windowGroup(): State = js.native
  def write(filename: String, callback: WriteCallback): Unit = js.native
}

