package typings.gm

import typings.gm.mod.ChannelOperator
import typings.gm.mod.ChannelType
import typings.gm.mod.ColorSpace
import typings.gm.mod.ComposeOperator
import typings.gm.mod.CompressionType
import typings.gm.mod.DisposeMethod
import typings.gm.mod.Encoding
import typings.gm.mod.EndianType
import typings.gm.mod.FilterType
import typings.gm.mod.GravityDirection
import typings.gm.mod.HighlightStyle
import typings.gm.mod.ImageType
import typings.gm.mod.IntentType
import typings.gm.mod.InterlaceType
import typings.gm.mod.LimitType
import typings.gm.mod.ListType
import typings.gm.mod.NamedColor
import typings.gm.mod.NoiseType
import typings.gm.mod.OperationMode
import typings.gm.mod.PreviewType
import typings.gm.mod.ResizeOption
import typings.gm.mod.SetDrawMethod
import typings.gm.mod.SetDrawProperty
import typings.gm.mod.UnitType
import typings.gm.mod.VirtualPixelMethod
import typings.gm.mod.VisualType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object gmStrings {
  @js.native
  sealed trait `@` extends ResizeOption
  
  @js.native
  sealed trait Absolute extends IntentType
  
  @js.native
  sealed trait Add
    extends ChannelOperator
       with ComposeOperator
  
  @js.native
  sealed trait AddNoise extends PreviewType
  
  @js.native
  sealed trait AdobeCustom extends Encoding
  
  @js.native
  sealed trait AdobeExpert extends Encoding
  
  @js.native
  sealed trait AdobeStandard extends Encoding
  
  @js.native
  sealed trait All extends ChannelType
  
  @js.native
  sealed trait And extends ChannelOperator
  
  @js.native
  sealed trait AppleRoman extends Encoding
  
  @js.native
  sealed trait Assign
    extends ChannelOperator
       with HighlightStyle
  
  @js.native
  sealed trait Atop extends ComposeOperator
  
  @js.native
  sealed trait BIG5 extends Encoding
  
  @js.native
  sealed trait BZip extends CompressionType
  
  @js.native
  sealed trait Background extends DisposeMethod
  
  @js.native
  sealed trait Bessel extends FilterType
  
  @js.native
  sealed trait Bilevel extends ImageType
  
  @js.native
  sealed trait Black
    extends ChannelType
       with NamedColor
  
  @js.native
  sealed trait Blackman extends FilterType
  
  @js.native
  sealed trait Blue
    extends ChannelType
       with NamedColor
  
  @js.native
  sealed trait Blur extends PreviewType
  
  @js.native
  sealed trait Box extends FilterType
  
  @js.native
  sealed trait Brightness extends PreviewType
  
  @js.native
  sealed trait Bumpmap extends ComposeOperator
  
  @js.native
  sealed trait CMYK extends ColorSpace
  
  @js.native
  sealed trait Catrom extends FilterType
  
  @js.native
  sealed trait Center extends GravityDirection
  
  @js.native
  sealed trait CharcoalDrawing extends PreviewType
  
  @js.native
  sealed trait CineonLog extends ColorSpace
  
  @js.native
  sealed trait Color extends ListType
  
  @js.native
  sealed trait ColorSeparation extends ImageType
  
  @js.native
  sealed trait ColorSeparationMatte extends ImageType
  
  @js.native
  sealed trait Constant extends VirtualPixelMethod
  
  @js.native
  sealed trait Copy extends ComposeOperator
  
  @js.native
  sealed trait CopyBlack extends ComposeOperator
  
  @js.native
  sealed trait CopyBlue extends ComposeOperator
  
  @js.native
  sealed trait CopyCyan extends ComposeOperator
  
  @js.native
  sealed trait CopyGreen extends ComposeOperator
  
  @js.native
  sealed trait CopyMagenta extends ComposeOperator
  
  @js.native
  sealed trait CopyOpacity extends ComposeOperator
  
  @js.native
  sealed trait CopyRed extends ComposeOperator
  
  @js.native
  sealed trait CopyYellow extends ComposeOperator
  
  @js.native
  sealed trait Cubic extends FilterType
  
  @js.native
  sealed trait Cyan
    extends ChannelType
       with NamedColor
  
  @js.native
  sealed trait Delegate extends ListType
  
  @js.native
  sealed trait Depth extends ChannelOperator
  
  @js.native
  sealed trait Despeckle extends PreviewType
  
  @js.native
  sealed trait Difference extends ComposeOperator
  
  @js.native
  sealed trait DirectColor extends VisualType
  
  @js.native
  sealed trait Divide
    extends ChannelOperator
       with ComposeOperator
  
  @js.native
  sealed trait Dull extends PreviewType
  
  @js.native
  sealed trait East extends GravityDirection
  
  @js.native
  sealed trait Edge extends VirtualPixelMethod
  
  @js.native
  sealed trait EdgeDetect extends PreviewType
  
  @js.native
  sealed trait Exclamationmark extends ResizeOption
  
  @js.native
  sealed trait Fax extends CompressionType
  
  @js.native
  sealed trait Format extends ListType
  
  @js.native
  sealed trait GB2312 extends Encoding
  
  @js.native
  sealed trait GRAY extends ColorSpace
  
  @js.native
  sealed trait Gamma
    extends ChannelOperator
       with PreviewType
  
  @js.native
  sealed trait Gaussian extends FilterType
  
  @js.native
  sealed trait GrayScale extends VisualType
  
  @js.native
  sealed trait Gray_ extends NamedColor
  
  @js.native
  sealed trait Grayscale_
    extends ImageType
       with PreviewType
  
  @js.native
  sealed trait Greaterthansign extends ResizeOption
  
  @js.native
  sealed trait Green
    extends ChannelType
       with NamedColor
  
  @js.native
  sealed trait Group4 extends CompressionType
  
  @js.native
  sealed trait HSB extends ColorSpace
  
  @js.native
  sealed trait HSL extends ColorSpace
  
  @js.native
  sealed trait Hamming extends FilterType
  
  @js.native
  sealed trait Hanning extends FilterType
  
  @js.native
  sealed trait Hermite extends FilterType
  
  @js.native
  sealed trait Hue extends PreviewType
  
  @js.native
  sealed trait Implode extends PreviewType
  
  @js.native
  sealed trait In extends ComposeOperator
  
  @js.native
  sealed trait Intensity extends ChannelType
  
  @js.native
  sealed trait JPEG
    extends CompressionType
       with PreviewType
  
  @js.native
  sealed trait LSB extends EndianType
  
  @js.native
  sealed trait LShift extends ChannelOperator
  
  @js.native
  sealed trait LZMA extends CompressionType
  
  @js.native
  sealed trait LZW extends CompressionType
  
  @js.native
  sealed trait Lanczos extends FilterType
  
  @js.native
  sealed trait `Latin 2` extends Encoding
  
  @js.native
  sealed trait Lessthansign extends ResizeOption
  
  @js.native
  sealed trait Line extends InterlaceType
  
  @js.native
  sealed trait Log extends ChannelOperator
  
  @js.native
  sealed trait Lossless extends CompressionType
  
  @js.native
  sealed trait MSB extends EndianType
  
  @js.native
  sealed trait Magenta
    extends ChannelType
       with NamedColor
  
  @js.native
  sealed trait Magic extends ListType
  
  @js.native
  sealed trait Matte extends NamedColor
  
  @js.native
  sealed trait Max extends ChannelOperator
  
  @js.native
  sealed trait Min extends ChannelOperator
  
  @js.native
  sealed trait Minus extends ComposeOperator
  
  @js.native
  sealed trait Mirror extends VirtualPixelMethod
  
  @js.native
  sealed trait Mitchell extends FilterType
  
  @js.native
  sealed trait Module extends ListType
  
  @js.native
  sealed trait Multiply
    extends ChannelOperator
       with ComposeOperator
  
  @js.native
  sealed trait Native extends EndianType
  
  @js.native
  sealed trait Negate extends ChannelOperator
  
  @js.native
  sealed trait `Noise-Gaussian` extends ChannelOperator
  
  @js.native
  sealed trait `Noise-Impulse` extends ChannelOperator
  
  @js.native
  sealed trait `Noise-Laplacian` extends ChannelOperator
  
  @js.native
  sealed trait `Noise-Multiplicative` extends ChannelOperator
  
  @js.native
  sealed trait `Noise-Poisson` extends ChannelOperator
  
  @js.native
  sealed trait `Noise-Random` extends ChannelOperator
  
  @js.native
  sealed trait `Noise-Uniform` extends ChannelOperator
  
  @js.native
  sealed trait None
    extends CompressionType
       with DisposeMethod
       with Encoding
       with InterlaceType
  
  @js.native
  sealed trait North extends GravityDirection
  
  @js.native
  sealed trait NorthEast extends GravityDirection
  
  @js.native
  sealed trait NorthWest extends GravityDirection
  
  @js.native
  sealed trait OHTA extends ColorSpace
  
  @js.native
  sealed trait OilPaint extends PreviewType
  
  @js.native
  sealed trait Opacity
    extends ChannelType
       with NamedColor
  
  @js.native
  sealed trait Optimize extends ImageType
  
  @js.native
  sealed trait Or extends ChannelOperator
  
  @js.native
  sealed trait Out extends ComposeOperator
  
  @js.native
  sealed trait Over extends ComposeOperator
  
  @js.native
  sealed trait Palette extends ImageType
  
  @js.native
  sealed trait PaletteMatte extends ImageType
  
  @js.native
  sealed trait Partition extends InterlaceType
  
  @js.native
  sealed trait Percentsign extends ResizeOption
  
  @js.native
  sealed trait Perceptual extends IntentType
  
  @js.native
  sealed trait PixelsPerCentimeter extends UnitType
  
  @js.native
  sealed trait PixelsPerInch extends UnitType
  
  @js.native
  sealed trait Plane extends InterlaceType
  
  @js.native
  sealed trait Plus extends ComposeOperator
  
  @js.native
  sealed trait Plussign extends js.Object
  
  @js.native
  sealed trait Point extends FilterType
  
  @js.native
  sealed trait Pow extends ChannelOperator
  
  @js.native
  sealed trait Previous extends DisposeMethod
  
  @js.native
  sealed trait PseudoColor extends VisualType
  
  @js.native
  sealed trait Quadratic extends FilterType
  
  @js.native
  sealed trait Quantize extends PreviewType
  
  @js.native
  sealed trait RGB extends ColorSpace
  
  @js.native
  sealed trait RLE extends CompressionType
  
  @js.native
  sealed trait RShift extends ChannelOperator
  
  @js.native
  sealed trait Raise extends PreviewType
  
  @js.native
  sealed trait Rec601Luma extends ColorSpace
  
  @js.native
  sealed trait Rec601YCbCr extends ColorSpace
  
  @js.native
  sealed trait Rec709Luma extends ColorSpace
  
  @js.native
  sealed trait Rec709YCbCr extends ColorSpace
  
  @js.native
  sealed trait Red
    extends ChannelType
       with NamedColor
  
  @js.native
  sealed trait ReduceNoise extends PreviewType
  
  @js.native
  sealed trait Relative extends IntentType
  
  @js.native
  sealed trait Resource extends ListType
  
  @js.native
  sealed trait Roll extends PreviewType
  
  @js.native
  sealed trait Rotate extends PreviewType
  
  @js.native
  sealed trait SJIScode extends Encoding
  
  @js.native
  sealed trait Saturation
    extends IntentType
       with PreviewType
  
  @js.native
  sealed trait Segment extends PreviewType
  
  @js.native
  sealed trait Shade extends PreviewType
  
  @js.native
  sealed trait Sharpen extends PreviewType
  
  @js.native
  sealed trait Shear extends PreviewType
  
  @js.native
  sealed trait Sinc extends FilterType
  
  @js.native
  sealed trait Solarize extends PreviewType
  
  @js.native
  sealed trait South extends GravityDirection
  
  @js.native
  sealed trait SouthEast extends GravityDirection
  
  @js.native
  sealed trait SouthWest extends GravityDirection
  
  @js.native
  sealed trait Spiff extends PreviewType
  
  @js.native
  sealed trait Spread extends PreviewType
  
  @js.native
  sealed trait StaticColor extends VisualType
  
  @js.native
  sealed trait StaticGray extends VisualType
  
  @js.native
  sealed trait Subtract
    extends ChannelOperator
       with ComposeOperator
  
  @js.native
  sealed trait Swirl extends PreviewType
  
  @js.native
  sealed trait Symbol extends Encoding
  
  @js.native
  sealed trait Threshold
    extends ChannelOperator
       with HighlightStyle
       with PreviewType
  
  @js.native
  sealed trait `Threshold-Black` extends ChannelOperator
  
  @js.native
  sealed trait `Threshold-Black-Negate` extends ChannelOperator
  
  @js.native
  sealed trait `Threshold-White` extends ChannelOperator
  
  @js.native
  sealed trait `Threshold-White-Negate` extends ChannelOperator
  
  @js.native
  sealed trait Tile extends VirtualPixelMethod
  
  @js.native
  sealed trait Tint extends HighlightStyle
  
  @js.native
  sealed trait Transparent extends ColorSpace
  
  @js.native
  sealed trait Triangle extends FilterType
  
  @js.native
  sealed trait TrueColor
    extends ImageType
       with VisualType
  
  @js.native
  sealed trait TrueColorMatte extends ImageType
  
  @js.native
  sealed trait Type extends ListType
  
  @js.native
  sealed trait Undefined
    extends DisposeMethod
       with UnitType
  
  @js.native
  sealed trait Unicode extends Encoding
  
  @js.native
  sealed trait Wansung extends Encoding
  
  @js.native
  sealed trait Wave extends PreviewType
  
  @js.native
  sealed trait West extends GravityDirection
  
  @js.native
  sealed trait XOR extends HighlightStyle
  
  @js.native
  sealed trait XYZ extends ColorSpace
  
  @js.native
  sealed trait Xor_
    extends ChannelOperator
       with ComposeOperator
  
  @js.native
  sealed trait YCbCr extends ColorSpace
  
  @js.native
  sealed trait YIQ extends ColorSpace
  
  @js.native
  sealed trait YPbPr extends ColorSpace
  
  @js.native
  sealed trait YUV extends ColorSpace
  
  @js.native
  sealed trait Yellow
    extends ChannelType
       with NamedColor
  
  @js.native
  sealed trait Zip extends CompressionType
  
  @js.native
  sealed trait ^ extends ResizeOption
  
  @js.native
  sealed trait center_ extends js.Object
  
  @js.native
  sealed trait color_ extends SetDrawProperty
  
  @js.native
  sealed trait concatenate extends OperationMode
  
  @js.native
  sealed trait default extends VisualType
  
  @js.native
  sealed trait disk extends LimitType
  
  @js.native
  sealed trait file extends LimitType
  
  @js.native
  sealed trait filltoborder extends SetDrawMethod
  
  @js.native
  sealed trait floodfill extends SetDrawMethod
  
  @js.native
  sealed trait frame extends OperationMode
  
  @js.native
  sealed trait gaussian_ extends NoiseType
  
  @js.native
  sealed trait impulse extends NoiseType
  
  @js.native
  sealed trait laplacian extends NoiseType
  
  @js.native
  sealed trait map extends LimitType
  
  @js.native
  sealed trait matte_ extends SetDrawProperty
  
  @js.native
  sealed trait memory extends LimitType
  
  @js.native
  sealed trait multiplicative extends NoiseType
  
  @js.native
  sealed trait pixels extends LimitType
  
  @js.native
  sealed trait point_ extends SetDrawMethod
  
  @js.native
  sealed trait poisson extends NoiseType
  
  @js.native
  sealed trait `private` extends js.Object
  
  @js.native
  sealed trait replace extends SetDrawMethod
  
  @js.native
  sealed trait reset extends SetDrawMethod
  
  @js.native
  sealed trait shared extends js.Object
  
  @js.native
  sealed trait threads extends LimitType
  
  @js.native
  sealed trait topleft extends js.Object
  
  @js.native
  sealed trait unframe extends OperationMode
  
  @js.native
  sealed trait uniform extends NoiseType
  
  @scala.inline
  def `@`: `@` = "@".asInstanceOf[`@`]
  @scala.inline
  def Absolute: Absolute = "Absolute".asInstanceOf[Absolute]
  @scala.inline
  def Add: Add = "Add".asInstanceOf[Add]
  @scala.inline
  def AddNoise: AddNoise = "AddNoise".asInstanceOf[AddNoise]
  @scala.inline
  def AdobeCustom: AdobeCustom = "AdobeCustom".asInstanceOf[AdobeCustom]
  @scala.inline
  def AdobeExpert: AdobeExpert = "AdobeExpert".asInstanceOf[AdobeExpert]
  @scala.inline
  def AdobeStandard: AdobeStandard = "AdobeStandard".asInstanceOf[AdobeStandard]
  @scala.inline
  def All: All = "All".asInstanceOf[All]
  @scala.inline
  def And: And = "And".asInstanceOf[And]
  @scala.inline
  def AppleRoman: AppleRoman = "AppleRoman".asInstanceOf[AppleRoman]
  @scala.inline
  def Assign: Assign = "Assign".asInstanceOf[Assign]
  @scala.inline
  def Atop: Atop = "Atop".asInstanceOf[Atop]
  @scala.inline
  def BIG5: BIG5 = "BIG5".asInstanceOf[BIG5]
  @scala.inline
  def BZip: BZip = "BZip".asInstanceOf[BZip]
  @scala.inline
  def Background: Background = "Background".asInstanceOf[Background]
  @scala.inline
  def Bessel: Bessel = "Bessel".asInstanceOf[Bessel]
  @scala.inline
  def Bilevel: Bilevel = "Bilevel".asInstanceOf[Bilevel]
  @scala.inline
  def Black: Black = "Black".asInstanceOf[Black]
  @scala.inline
  def Blackman: Blackman = "Blackman".asInstanceOf[Blackman]
  @scala.inline
  def Blue: Blue = "Blue".asInstanceOf[Blue]
  @scala.inline
  def Blur: Blur = "Blur".asInstanceOf[Blur]
  @scala.inline
  def Box: Box = "Box".asInstanceOf[Box]
  @scala.inline
  def Brightness: Brightness = "Brightness".asInstanceOf[Brightness]
  @scala.inline
  def Bumpmap: Bumpmap = "Bumpmap".asInstanceOf[Bumpmap]
  @scala.inline
  def CMYK: CMYK = "CMYK".asInstanceOf[CMYK]
  @scala.inline
  def Catrom: Catrom = "Catrom".asInstanceOf[Catrom]
  @scala.inline
  def Center: Center = "Center".asInstanceOf[Center]
  @scala.inline
  def CharcoalDrawing: CharcoalDrawing = "CharcoalDrawing".asInstanceOf[CharcoalDrawing]
  @scala.inline
  def CineonLog: CineonLog = "CineonLog".asInstanceOf[CineonLog]
  @scala.inline
  def Color: Color = "Color".asInstanceOf[Color]
  @scala.inline
  def ColorSeparation: ColorSeparation = "ColorSeparation".asInstanceOf[ColorSeparation]
  @scala.inline
  def ColorSeparationMatte: ColorSeparationMatte = "ColorSeparationMatte".asInstanceOf[ColorSeparationMatte]
  @scala.inline
  def Constant: Constant = "Constant".asInstanceOf[Constant]
  @scala.inline
  def Copy: Copy = "Copy".asInstanceOf[Copy]
  @scala.inline
  def CopyBlack: CopyBlack = "CopyBlack".asInstanceOf[CopyBlack]
  @scala.inline
  def CopyBlue: CopyBlue = "CopyBlue".asInstanceOf[CopyBlue]
  @scala.inline
  def CopyCyan: CopyCyan = "CopyCyan".asInstanceOf[CopyCyan]
  @scala.inline
  def CopyGreen: CopyGreen = "CopyGreen".asInstanceOf[CopyGreen]
  @scala.inline
  def CopyMagenta: CopyMagenta = "CopyMagenta".asInstanceOf[CopyMagenta]
  @scala.inline
  def CopyOpacity: CopyOpacity = "CopyOpacity".asInstanceOf[CopyOpacity]
  @scala.inline
  def CopyRed: CopyRed = "CopyRed".asInstanceOf[CopyRed]
  @scala.inline
  def CopyYellow: CopyYellow = "CopyYellow".asInstanceOf[CopyYellow]
  @scala.inline
  def Cubic: Cubic = "Cubic".asInstanceOf[Cubic]
  @scala.inline
  def Cyan: Cyan = "Cyan".asInstanceOf[Cyan]
  @scala.inline
  def Delegate: Delegate = "Delegate".asInstanceOf[Delegate]
  @scala.inline
  def Depth: Depth = "Depth".asInstanceOf[Depth]
  @scala.inline
  def Despeckle: Despeckle = "Despeckle".asInstanceOf[Despeckle]
  @scala.inline
  def Difference: Difference = "Difference".asInstanceOf[Difference]
  @scala.inline
  def DirectColor: DirectColor = "DirectColor".asInstanceOf[DirectColor]
  @scala.inline
  def Divide: Divide = "Divide".asInstanceOf[Divide]
  @scala.inline
  def Dull: Dull = "Dull".asInstanceOf[Dull]
  @scala.inline
  def East: East = "East".asInstanceOf[East]
  @scala.inline
  def Edge: Edge = "Edge".asInstanceOf[Edge]
  @scala.inline
  def EdgeDetect: EdgeDetect = "EdgeDetect".asInstanceOf[EdgeDetect]
  @scala.inline
  def Exclamationmark: Exclamationmark = "!".asInstanceOf[Exclamationmark]
  @scala.inline
  def Fax: Fax = "Fax".asInstanceOf[Fax]
  @scala.inline
  def Format: Format = "Format".asInstanceOf[Format]
  @scala.inline
  def GB2312: GB2312 = "GB2312".asInstanceOf[GB2312]
  @scala.inline
  def GRAY: GRAY = "GRAY".asInstanceOf[GRAY]
  @scala.inline
  def Gamma: Gamma = "Gamma".asInstanceOf[Gamma]
  @scala.inline
  def Gaussian: Gaussian = "Gaussian".asInstanceOf[Gaussian]
  @scala.inline
  def GrayScale: GrayScale = "GrayScale".asInstanceOf[GrayScale]
  @scala.inline
  def Gray_ : Gray_ = "Gray".asInstanceOf[Gray_]
  @scala.inline
  def Grayscale_ : Grayscale_ = "Grayscale".asInstanceOf[Grayscale_]
  @scala.inline
  def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  @scala.inline
  def Green: Green = "Green".asInstanceOf[Green]
  @scala.inline
  def Group4: Group4 = "Group4".asInstanceOf[Group4]
  @scala.inline
  def HSB: HSB = "HSB".asInstanceOf[HSB]
  @scala.inline
  def HSL: HSL = "HSL".asInstanceOf[HSL]
  @scala.inline
  def Hamming: Hamming = "Hamming".asInstanceOf[Hamming]
  @scala.inline
  def Hanning: Hanning = "Hanning".asInstanceOf[Hanning]
  @scala.inline
  def Hermite: Hermite = "Hermite".asInstanceOf[Hermite]
  @scala.inline
  def Hue: Hue = "Hue".asInstanceOf[Hue]
  @scala.inline
  def Implode: Implode = "Implode".asInstanceOf[Implode]
  @scala.inline
  def In: In = "In".asInstanceOf[In]
  @scala.inline
  def Intensity: Intensity = "Intensity".asInstanceOf[Intensity]
  @scala.inline
  def JPEG: JPEG = "JPEG".asInstanceOf[JPEG]
  @scala.inline
  def LSB: LSB = "LSB".asInstanceOf[LSB]
  @scala.inline
  def LShift: LShift = "LShift".asInstanceOf[LShift]
  @scala.inline
  def LZMA: LZMA = "LZMA".asInstanceOf[LZMA]
  @scala.inline
  def LZW: LZW = "LZW".asInstanceOf[LZW]
  @scala.inline
  def Lanczos: Lanczos = "Lanczos".asInstanceOf[Lanczos]
  @scala.inline
  def `Latin 2`: `Latin 2` = ("Latin 2").asInstanceOf[`Latin 2`]
  @scala.inline
  def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  @scala.inline
  def Line: Line = "Line".asInstanceOf[Line]
  @scala.inline
  def Log: Log = "Log".asInstanceOf[Log]
  @scala.inline
  def Lossless: Lossless = "Lossless".asInstanceOf[Lossless]
  @scala.inline
  def MSB: MSB = "MSB".asInstanceOf[MSB]
  @scala.inline
  def Magenta: Magenta = "Magenta".asInstanceOf[Magenta]
  @scala.inline
  def Magic: Magic = "Magic".asInstanceOf[Magic]
  @scala.inline
  def Matte: Matte = "Matte".asInstanceOf[Matte]
  @scala.inline
  def Max: Max = "Max".asInstanceOf[Max]
  @scala.inline
  def Min: Min = "Min".asInstanceOf[Min]
  @scala.inline
  def Minus: Minus = "Minus".asInstanceOf[Minus]
  @scala.inline
  def Mirror: Mirror = "Mirror".asInstanceOf[Mirror]
  @scala.inline
  def Mitchell: Mitchell = "Mitchell".asInstanceOf[Mitchell]
  @scala.inline
  def Module: Module = "Module".asInstanceOf[Module]
  @scala.inline
  def Multiply: Multiply = "Multiply".asInstanceOf[Multiply]
  @scala.inline
  def Native: Native = "Native".asInstanceOf[Native]
  @scala.inline
  def Negate: Negate = "Negate".asInstanceOf[Negate]
  @scala.inline
  def `Noise-Gaussian`: `Noise-Gaussian` = "Noise-Gaussian".asInstanceOf[`Noise-Gaussian`]
  @scala.inline
  def `Noise-Impulse`: `Noise-Impulse` = "Noise-Impulse".asInstanceOf[`Noise-Impulse`]
  @scala.inline
  def `Noise-Laplacian`: `Noise-Laplacian` = "Noise-Laplacian".asInstanceOf[`Noise-Laplacian`]
  @scala.inline
  def `Noise-Multiplicative`: `Noise-Multiplicative` = "Noise-Multiplicative".asInstanceOf[`Noise-Multiplicative`]
  @scala.inline
  def `Noise-Poisson`: `Noise-Poisson` = "Noise-Poisson".asInstanceOf[`Noise-Poisson`]
  @scala.inline
  def `Noise-Random`: `Noise-Random` = "Noise-Random".asInstanceOf[`Noise-Random`]
  @scala.inline
  def `Noise-Uniform`: `Noise-Uniform` = "Noise-Uniform".asInstanceOf[`Noise-Uniform`]
  @scala.inline
  def None: None = "None".asInstanceOf[None]
  @scala.inline
  def North: North = "North".asInstanceOf[North]
  @scala.inline
  def NorthEast: NorthEast = "NorthEast".asInstanceOf[NorthEast]
  @scala.inline
  def NorthWest: NorthWest = "NorthWest".asInstanceOf[NorthWest]
  @scala.inline
  def OHTA: OHTA = "OHTA".asInstanceOf[OHTA]
  @scala.inline
  def OilPaint: OilPaint = "OilPaint".asInstanceOf[OilPaint]
  @scala.inline
  def Opacity: Opacity = "Opacity".asInstanceOf[Opacity]
  @scala.inline
  def Optimize: Optimize = "Optimize".asInstanceOf[Optimize]
  @scala.inline
  def Or: Or = "Or".asInstanceOf[Or]
  @scala.inline
  def Out: Out = "Out".asInstanceOf[Out]
  @scala.inline
  def Over: Over = "Over".asInstanceOf[Over]
  @scala.inline
  def Palette: Palette = "Palette".asInstanceOf[Palette]
  @scala.inline
  def PaletteMatte: PaletteMatte = "PaletteMatte".asInstanceOf[PaletteMatte]
  @scala.inline
  def Partition: Partition = "Partition".asInstanceOf[Partition]
  @scala.inline
  def Percentsign: Percentsign = "%".asInstanceOf[Percentsign]
  @scala.inline
  def Perceptual: Perceptual = "Perceptual".asInstanceOf[Perceptual]
  @scala.inline
  def PixelsPerCentimeter: PixelsPerCentimeter = "PixelsPerCentimeter".asInstanceOf[PixelsPerCentimeter]
  @scala.inline
  def PixelsPerInch: PixelsPerInch = "PixelsPerInch".asInstanceOf[PixelsPerInch]
  @scala.inline
  def Plane: Plane = "Plane".asInstanceOf[Plane]
  @scala.inline
  def Plus: Plus = "Plus".asInstanceOf[Plus]
  @scala.inline
  def Plussign: Plussign = "+".asInstanceOf[Plussign]
  @scala.inline
  def Point: Point = "Point".asInstanceOf[Point]
  @scala.inline
  def Pow: Pow = "Pow".asInstanceOf[Pow]
  @scala.inline
  def Previous: Previous = "Previous".asInstanceOf[Previous]
  @scala.inline
  def PseudoColor: PseudoColor = "PseudoColor".asInstanceOf[PseudoColor]
  @scala.inline
  def Quadratic: Quadratic = "Quadratic".asInstanceOf[Quadratic]
  @scala.inline
  def Quantize: Quantize = "Quantize".asInstanceOf[Quantize]
  @scala.inline
  def RGB: RGB = "RGB".asInstanceOf[RGB]
  @scala.inline
  def RLE: RLE = "RLE".asInstanceOf[RLE]
  @scala.inline
  def RShift: RShift = "RShift".asInstanceOf[RShift]
  @scala.inline
  def Raise: Raise = "Raise".asInstanceOf[Raise]
  @scala.inline
  def Rec601Luma: Rec601Luma = "Rec601Luma".asInstanceOf[Rec601Luma]
  @scala.inline
  def Rec601YCbCr: Rec601YCbCr = "Rec601YCbCr".asInstanceOf[Rec601YCbCr]
  @scala.inline
  def Rec709Luma: Rec709Luma = "Rec709Luma".asInstanceOf[Rec709Luma]
  @scala.inline
  def Rec709YCbCr: Rec709YCbCr = "Rec709YCbCr".asInstanceOf[Rec709YCbCr]
  @scala.inline
  def Red: Red = "Red".asInstanceOf[Red]
  @scala.inline
  def ReduceNoise: ReduceNoise = "ReduceNoise".asInstanceOf[ReduceNoise]
  @scala.inline
  def Relative: Relative = "Relative".asInstanceOf[Relative]
  @scala.inline
  def Resource: Resource = "Resource".asInstanceOf[Resource]
  @scala.inline
  def Roll: Roll = "Roll".asInstanceOf[Roll]
  @scala.inline
  def Rotate: Rotate = "Rotate".asInstanceOf[Rotate]
  @scala.inline
  def SJIScode: SJIScode = "SJIScode".asInstanceOf[SJIScode]
  @scala.inline
  def Saturation: Saturation = "Saturation".asInstanceOf[Saturation]
  @scala.inline
  def Segment: Segment = "Segment".asInstanceOf[Segment]
  @scala.inline
  def Shade: Shade = "Shade".asInstanceOf[Shade]
  @scala.inline
  def Sharpen: Sharpen = "Sharpen".asInstanceOf[Sharpen]
  @scala.inline
  def Shear: Shear = "Shear".asInstanceOf[Shear]
  @scala.inline
  def Sinc: Sinc = "Sinc".asInstanceOf[Sinc]
  @scala.inline
  def Solarize: Solarize = "Solarize".asInstanceOf[Solarize]
  @scala.inline
  def South: South = "South".asInstanceOf[South]
  @scala.inline
  def SouthEast: SouthEast = "SouthEast".asInstanceOf[SouthEast]
  @scala.inline
  def SouthWest: SouthWest = "SouthWest".asInstanceOf[SouthWest]
  @scala.inline
  def Spiff: Spiff = "Spiff".asInstanceOf[Spiff]
  @scala.inline
  def Spread: Spread = "Spread".asInstanceOf[Spread]
  @scala.inline
  def StaticColor: StaticColor = "StaticColor".asInstanceOf[StaticColor]
  @scala.inline
  def StaticGray: StaticGray = "StaticGray".asInstanceOf[StaticGray]
  @scala.inline
  def Subtract: Subtract = "Subtract".asInstanceOf[Subtract]
  @scala.inline
  def Swirl: Swirl = "Swirl".asInstanceOf[Swirl]
  @scala.inline
  def Symbol: Symbol = "Symbol".asInstanceOf[Symbol]
  @scala.inline
  def Threshold: Threshold = "Threshold".asInstanceOf[Threshold]
  @scala.inline
  def `Threshold-Black`: `Threshold-Black` = "Threshold-Black".asInstanceOf[`Threshold-Black`]
  @scala.inline
  def `Threshold-Black-Negate`: `Threshold-Black-Negate` = "Threshold-Black-Negate".asInstanceOf[`Threshold-Black-Negate`]
  @scala.inline
  def `Threshold-White`: `Threshold-White` = "Threshold-White".asInstanceOf[`Threshold-White`]
  @scala.inline
  def `Threshold-White-Negate`: `Threshold-White-Negate` = "Threshold-White-Negate".asInstanceOf[`Threshold-White-Negate`]
  @scala.inline
  def Tile: Tile = "Tile".asInstanceOf[Tile]
  @scala.inline
  def Tint: Tint = "Tint".asInstanceOf[Tint]
  @scala.inline
  def Transparent: Transparent = "Transparent".asInstanceOf[Transparent]
  @scala.inline
  def Triangle: Triangle = "Triangle".asInstanceOf[Triangle]
  @scala.inline
  def TrueColor: TrueColor = "TrueColor".asInstanceOf[TrueColor]
  @scala.inline
  def TrueColorMatte: TrueColorMatte = "TrueColorMatte".asInstanceOf[TrueColorMatte]
  @scala.inline
  def Type: Type = "Type".asInstanceOf[Type]
  @scala.inline
  def Undefined: Undefined = "Undefined".asInstanceOf[Undefined]
  @scala.inline
  def Unicode: Unicode = "Unicode".asInstanceOf[Unicode]
  @scala.inline
  def Wansung: Wansung = "Wansung".asInstanceOf[Wansung]
  @scala.inline
  def Wave: Wave = "Wave".asInstanceOf[Wave]
  @scala.inline
  def West: West = "West".asInstanceOf[West]
  @scala.inline
  def XOR: XOR = "XOR".asInstanceOf[XOR]
  @scala.inline
  def XYZ: XYZ = "XYZ".asInstanceOf[XYZ]
  @scala.inline
  def Xor_ : Xor_ = "Xor".asInstanceOf[Xor_]
  @scala.inline
  def YCbCr: YCbCr = "YCbCr".asInstanceOf[YCbCr]
  @scala.inline
  def YIQ: YIQ = "YIQ".asInstanceOf[YIQ]
  @scala.inline
  def YPbPr: YPbPr = "YPbPr".asInstanceOf[YPbPr]
  @scala.inline
  def YUV: YUV = "YUV".asInstanceOf[YUV]
  @scala.inline
  def Yellow: Yellow = "Yellow".asInstanceOf[Yellow]
  @scala.inline
  def Zip: Zip = "Zip".asInstanceOf[Zip]
  @scala.inline
  def ^ : ^ = "^".asInstanceOf[^]
  @scala.inline
  def center_ : center_ = "center".asInstanceOf[center_]
  @scala.inline
  def color_ : color_ = "color".asInstanceOf[color_]
  @scala.inline
  def concatenate: concatenate = "concatenate".asInstanceOf[concatenate]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def disk: disk = "disk".asInstanceOf[disk]
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  @scala.inline
  def filltoborder: filltoborder = "filltoborder".asInstanceOf[filltoborder]
  @scala.inline
  def floodfill: floodfill = "floodfill".asInstanceOf[floodfill]
  @scala.inline
  def frame: frame = "frame".asInstanceOf[frame]
  @scala.inline
  def gaussian_ : gaussian_ = "gaussian".asInstanceOf[gaussian_]
  @scala.inline
  def impulse: impulse = "impulse".asInstanceOf[impulse]
  @scala.inline
  def laplacian: laplacian = "laplacian".asInstanceOf[laplacian]
  @scala.inline
  def map: map = "map".asInstanceOf[map]
  @scala.inline
  def matte_ : matte_ = "matte".asInstanceOf[matte_]
  @scala.inline
  def memory: memory = "memory".asInstanceOf[memory]
  @scala.inline
  def multiplicative: multiplicative = "multiplicative".asInstanceOf[multiplicative]
  @scala.inline
  def pixels: pixels = "pixels".asInstanceOf[pixels]
  @scala.inline
  def point_ : point_ = "point".asInstanceOf[point_]
  @scala.inline
  def poisson: poisson = "poisson".asInstanceOf[poisson]
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
  @scala.inline
  def reset: reset = "reset".asInstanceOf[reset]
  @scala.inline
  def shared: shared = "shared".asInstanceOf[shared]
  @scala.inline
  def threads: threads = "threads".asInstanceOf[threads]
  @scala.inline
  def topleft: topleft = "topleft".asInstanceOf[topleft]
  @scala.inline
  def unframe: unframe = "unframe".asInstanceOf[unframe]
  @scala.inline
  def uniform: uniform = "uniform".asInstanceOf[uniform]
}

