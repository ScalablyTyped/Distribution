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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gmStrings {
  
  @js.native
  sealed trait ^ extends ResizeOption
  @scala.inline
  def ^ : ^ = "^".asInstanceOf[^]
  
  @js.native
  sealed trait default extends VisualType
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait `@` extends ResizeOption
  @scala.inline
  def `@`: `@` = "@".asInstanceOf[`@`]
  
  @js.native
  sealed trait Absolute extends IntentType
  @scala.inline
  def Absolute: Absolute = "Absolute".asInstanceOf[Absolute]
  
  @js.native
  sealed trait Add
    extends ChannelOperator
       with ComposeOperator
  @scala.inline
  def Add: Add = "Add".asInstanceOf[Add]
  
  @js.native
  sealed trait AddNoise extends PreviewType
  @scala.inline
  def AddNoise: AddNoise = "AddNoise".asInstanceOf[AddNoise]
  
  @js.native
  sealed trait AdobeCustom extends Encoding
  @scala.inline
  def AdobeCustom: AdobeCustom = "AdobeCustom".asInstanceOf[AdobeCustom]
  
  @js.native
  sealed trait AdobeExpert extends Encoding
  @scala.inline
  def AdobeExpert: AdobeExpert = "AdobeExpert".asInstanceOf[AdobeExpert]
  
  @js.native
  sealed trait AdobeStandard extends Encoding
  @scala.inline
  def AdobeStandard: AdobeStandard = "AdobeStandard".asInstanceOf[AdobeStandard]
  
  @js.native
  sealed trait All extends ChannelType
  @scala.inline
  def All: All = "All".asInstanceOf[All]
  
  @js.native
  sealed trait And extends ChannelOperator
  @scala.inline
  def And: And = "And".asInstanceOf[And]
  
  @js.native
  sealed trait AppleRoman extends Encoding
  @scala.inline
  def AppleRoman: AppleRoman = "AppleRoman".asInstanceOf[AppleRoman]
  
  @js.native
  sealed trait Assign
    extends ChannelOperator
       with HighlightStyle
  @scala.inline
  def Assign: Assign = "Assign".asInstanceOf[Assign]
  
  @js.native
  sealed trait Atop extends ComposeOperator
  @scala.inline
  def Atop: Atop = "Atop".asInstanceOf[Atop]
  
  @js.native
  sealed trait BIG5 extends Encoding
  @scala.inline
  def BIG5: BIG5 = "BIG5".asInstanceOf[BIG5]
  
  @js.native
  sealed trait BZip extends CompressionType
  @scala.inline
  def BZip: BZip = "BZip".asInstanceOf[BZip]
  
  @js.native
  sealed trait Background extends DisposeMethod
  @scala.inline
  def Background: Background = "Background".asInstanceOf[Background]
  
  @js.native
  sealed trait Bessel extends FilterType
  @scala.inline
  def Bessel: Bessel = "Bessel".asInstanceOf[Bessel]
  
  @js.native
  sealed trait Bilevel extends ImageType
  @scala.inline
  def Bilevel: Bilevel = "Bilevel".asInstanceOf[Bilevel]
  
  @js.native
  sealed trait Black
    extends ChannelType
       with NamedColor
  @scala.inline
  def Black: Black = "Black".asInstanceOf[Black]
  
  @js.native
  sealed trait Blackman extends FilterType
  @scala.inline
  def Blackman: Blackman = "Blackman".asInstanceOf[Blackman]
  
  @js.native
  sealed trait Blue
    extends ChannelType
       with NamedColor
  @scala.inline
  def Blue: Blue = "Blue".asInstanceOf[Blue]
  
  @js.native
  sealed trait Blur extends PreviewType
  @scala.inline
  def Blur: Blur = "Blur".asInstanceOf[Blur]
  
  @js.native
  sealed trait Box extends FilterType
  @scala.inline
  def Box: Box = "Box".asInstanceOf[Box]
  
  @js.native
  sealed trait Brightness extends PreviewType
  @scala.inline
  def Brightness: Brightness = "Brightness".asInstanceOf[Brightness]
  
  @js.native
  sealed trait Bumpmap extends ComposeOperator
  @scala.inline
  def Bumpmap: Bumpmap = "Bumpmap".asInstanceOf[Bumpmap]
  
  @js.native
  sealed trait CMYK extends ColorSpace
  @scala.inline
  def CMYK: CMYK = "CMYK".asInstanceOf[CMYK]
  
  @js.native
  sealed trait Catrom extends FilterType
  @scala.inline
  def Catrom: Catrom = "Catrom".asInstanceOf[Catrom]
  
  @js.native
  sealed trait Center extends GravityDirection
  @scala.inline
  def Center: Center = "Center".asInstanceOf[Center]
  
  @js.native
  sealed trait CharcoalDrawing extends PreviewType
  @scala.inline
  def CharcoalDrawing: CharcoalDrawing = "CharcoalDrawing".asInstanceOf[CharcoalDrawing]
  
  @js.native
  sealed trait CineonLog extends ColorSpace
  @scala.inline
  def CineonLog: CineonLog = "CineonLog".asInstanceOf[CineonLog]
  
  @js.native
  sealed trait Color extends ListType
  @scala.inline
  def Color: Color = "Color".asInstanceOf[Color]
  
  @js.native
  sealed trait ColorSeparation extends ImageType
  @scala.inline
  def ColorSeparation: ColorSeparation = "ColorSeparation".asInstanceOf[ColorSeparation]
  
  @js.native
  sealed trait ColorSeparationMatte extends ImageType
  @scala.inline
  def ColorSeparationMatte: ColorSeparationMatte = "ColorSeparationMatte".asInstanceOf[ColorSeparationMatte]
  
  @js.native
  sealed trait Constant extends VirtualPixelMethod
  @scala.inline
  def Constant: Constant = "Constant".asInstanceOf[Constant]
  
  @js.native
  sealed trait Copy extends ComposeOperator
  @scala.inline
  def Copy: Copy = "Copy".asInstanceOf[Copy]
  
  @js.native
  sealed trait CopyBlack extends ComposeOperator
  @scala.inline
  def CopyBlack: CopyBlack = "CopyBlack".asInstanceOf[CopyBlack]
  
  @js.native
  sealed trait CopyBlue extends ComposeOperator
  @scala.inline
  def CopyBlue: CopyBlue = "CopyBlue".asInstanceOf[CopyBlue]
  
  @js.native
  sealed trait CopyCyan extends ComposeOperator
  @scala.inline
  def CopyCyan: CopyCyan = "CopyCyan".asInstanceOf[CopyCyan]
  
  @js.native
  sealed trait CopyGreen extends ComposeOperator
  @scala.inline
  def CopyGreen: CopyGreen = "CopyGreen".asInstanceOf[CopyGreen]
  
  @js.native
  sealed trait CopyMagenta extends ComposeOperator
  @scala.inline
  def CopyMagenta: CopyMagenta = "CopyMagenta".asInstanceOf[CopyMagenta]
  
  @js.native
  sealed trait CopyOpacity extends ComposeOperator
  @scala.inline
  def CopyOpacity: CopyOpacity = "CopyOpacity".asInstanceOf[CopyOpacity]
  
  @js.native
  sealed trait CopyRed extends ComposeOperator
  @scala.inline
  def CopyRed: CopyRed = "CopyRed".asInstanceOf[CopyRed]
  
  @js.native
  sealed trait CopyYellow extends ComposeOperator
  @scala.inline
  def CopyYellow: CopyYellow = "CopyYellow".asInstanceOf[CopyYellow]
  
  @js.native
  sealed trait Cubic extends FilterType
  @scala.inline
  def Cubic: Cubic = "Cubic".asInstanceOf[Cubic]
  
  @js.native
  sealed trait Cyan
    extends ChannelType
       with NamedColor
  @scala.inline
  def Cyan: Cyan = "Cyan".asInstanceOf[Cyan]
  
  @js.native
  sealed trait Delegate extends ListType
  @scala.inline
  def Delegate: Delegate = "Delegate".asInstanceOf[Delegate]
  
  @js.native
  sealed trait Depth extends ChannelOperator
  @scala.inline
  def Depth: Depth = "Depth".asInstanceOf[Depth]
  
  @js.native
  sealed trait Despeckle extends PreviewType
  @scala.inline
  def Despeckle: Despeckle = "Despeckle".asInstanceOf[Despeckle]
  
  @js.native
  sealed trait Difference extends ComposeOperator
  @scala.inline
  def Difference: Difference = "Difference".asInstanceOf[Difference]
  
  @js.native
  sealed trait DirectColor extends VisualType
  @scala.inline
  def DirectColor: DirectColor = "DirectColor".asInstanceOf[DirectColor]
  
  @js.native
  sealed trait Divide
    extends ChannelOperator
       with ComposeOperator
  @scala.inline
  def Divide: Divide = "Divide".asInstanceOf[Divide]
  
  @js.native
  sealed trait Dull extends PreviewType
  @scala.inline
  def Dull: Dull = "Dull".asInstanceOf[Dull]
  
  @js.native
  sealed trait East extends GravityDirection
  @scala.inline
  def East: East = "East".asInstanceOf[East]
  
  @js.native
  sealed trait Edge extends VirtualPixelMethod
  @scala.inline
  def Edge: Edge = "Edge".asInstanceOf[Edge]
  
  @js.native
  sealed trait EdgeDetect extends PreviewType
  @scala.inline
  def EdgeDetect: EdgeDetect = "EdgeDetect".asInstanceOf[EdgeDetect]
  
  @js.native
  sealed trait Exclamationmark extends ResizeOption
  @scala.inline
  def Exclamationmark: Exclamationmark = "!".asInstanceOf[Exclamationmark]
  
  @js.native
  sealed trait Fax extends CompressionType
  @scala.inline
  def Fax: Fax = "Fax".asInstanceOf[Fax]
  
  @js.native
  sealed trait Format extends ListType
  @scala.inline
  def Format: Format = "Format".asInstanceOf[Format]
  
  @js.native
  sealed trait GB2312 extends Encoding
  @scala.inline
  def GB2312: GB2312 = "GB2312".asInstanceOf[GB2312]
  
  @js.native
  sealed trait GRAY extends ColorSpace
  @scala.inline
  def GRAY: GRAY = "GRAY".asInstanceOf[GRAY]
  
  @js.native
  sealed trait Gamma
    extends ChannelOperator
       with PreviewType
  @scala.inline
  def Gamma: Gamma = "Gamma".asInstanceOf[Gamma]
  
  @js.native
  sealed trait Gaussian extends FilterType
  @scala.inline
  def Gaussian: Gaussian = "Gaussian".asInstanceOf[Gaussian]
  
  @js.native
  sealed trait GrayScale extends VisualType
  @scala.inline
  def GrayScale: GrayScale = "GrayScale".asInstanceOf[GrayScale]
  
  @js.native
  sealed trait Gray_ extends NamedColor
  @scala.inline
  def Gray_ : Gray_ = "Gray".asInstanceOf[Gray_]
  
  @js.native
  sealed trait Grayscale_
    extends ImageType
       with PreviewType
  @scala.inline
  def Grayscale_ : Grayscale_ = "Grayscale".asInstanceOf[Grayscale_]
  
  @js.native
  sealed trait Greaterthansign extends ResizeOption
  @scala.inline
  def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait Green
    extends ChannelType
       with NamedColor
  @scala.inline
  def Green: Green = "Green".asInstanceOf[Green]
  
  @js.native
  sealed trait Group4 extends CompressionType
  @scala.inline
  def Group4: Group4 = "Group4".asInstanceOf[Group4]
  
  @js.native
  sealed trait HSB extends ColorSpace
  @scala.inline
  def HSB: HSB = "HSB".asInstanceOf[HSB]
  
  @js.native
  sealed trait HSL extends ColorSpace
  @scala.inline
  def HSL: HSL = "HSL".asInstanceOf[HSL]
  
  @js.native
  sealed trait Hamming extends FilterType
  @scala.inline
  def Hamming: Hamming = "Hamming".asInstanceOf[Hamming]
  
  @js.native
  sealed trait Hanning extends FilterType
  @scala.inline
  def Hanning: Hanning = "Hanning".asInstanceOf[Hanning]
  
  @js.native
  sealed trait Hermite extends FilterType
  @scala.inline
  def Hermite: Hermite = "Hermite".asInstanceOf[Hermite]
  
  @js.native
  sealed trait Hue extends PreviewType
  @scala.inline
  def Hue: Hue = "Hue".asInstanceOf[Hue]
  
  @js.native
  sealed trait Implode extends PreviewType
  @scala.inline
  def Implode: Implode = "Implode".asInstanceOf[Implode]
  
  @js.native
  sealed trait In extends ComposeOperator
  @scala.inline
  def In: In = "In".asInstanceOf[In]
  
  @js.native
  sealed trait Intensity extends ChannelType
  @scala.inline
  def Intensity: Intensity = "Intensity".asInstanceOf[Intensity]
  
  @js.native
  sealed trait JPEG
    extends CompressionType
       with PreviewType
  @scala.inline
  def JPEG: JPEG = "JPEG".asInstanceOf[JPEG]
  
  @js.native
  sealed trait LSB extends EndianType
  @scala.inline
  def LSB: LSB = "LSB".asInstanceOf[LSB]
  
  @js.native
  sealed trait LShift extends ChannelOperator
  @scala.inline
  def LShift: LShift = "LShift".asInstanceOf[LShift]
  
  @js.native
  sealed trait LZMA extends CompressionType
  @scala.inline
  def LZMA: LZMA = "LZMA".asInstanceOf[LZMA]
  
  @js.native
  sealed trait LZW extends CompressionType
  @scala.inline
  def LZW: LZW = "LZW".asInstanceOf[LZW]
  
  @js.native
  sealed trait Lanczos extends FilterType
  @scala.inline
  def Lanczos: Lanczos = "Lanczos".asInstanceOf[Lanczos]
  
  @js.native
  sealed trait `Latin 2` extends Encoding
  @scala.inline
  def `Latin 2`: `Latin 2` = ("Latin 2").asInstanceOf[`Latin 2`]
  
  @js.native
  sealed trait Lessthansign extends ResizeOption
  @scala.inline
  def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait Line extends InterlaceType
  @scala.inline
  def Line: Line = "Line".asInstanceOf[Line]
  
  @js.native
  sealed trait Log extends ChannelOperator
  @scala.inline
  def Log: Log = "Log".asInstanceOf[Log]
  
  @js.native
  sealed trait Lossless extends CompressionType
  @scala.inline
  def Lossless: Lossless = "Lossless".asInstanceOf[Lossless]
  
  @js.native
  sealed trait MSB extends EndianType
  @scala.inline
  def MSB: MSB = "MSB".asInstanceOf[MSB]
  
  @js.native
  sealed trait Magenta
    extends ChannelType
       with NamedColor
  @scala.inline
  def Magenta: Magenta = "Magenta".asInstanceOf[Magenta]
  
  @js.native
  sealed trait Magic extends ListType
  @scala.inline
  def Magic: Magic = "Magic".asInstanceOf[Magic]
  
  @js.native
  sealed trait Matte extends NamedColor
  @scala.inline
  def Matte: Matte = "Matte".asInstanceOf[Matte]
  
  @js.native
  sealed trait Max extends ChannelOperator
  @scala.inline
  def Max: Max = "Max".asInstanceOf[Max]
  
  @js.native
  sealed trait Min extends ChannelOperator
  @scala.inline
  def Min: Min = "Min".asInstanceOf[Min]
  
  @js.native
  sealed trait Minus extends ComposeOperator
  @scala.inline
  def Minus: Minus = "Minus".asInstanceOf[Minus]
  
  @js.native
  sealed trait Mirror extends VirtualPixelMethod
  @scala.inline
  def Mirror: Mirror = "Mirror".asInstanceOf[Mirror]
  
  @js.native
  sealed trait Mitchell extends FilterType
  @scala.inline
  def Mitchell: Mitchell = "Mitchell".asInstanceOf[Mitchell]
  
  @js.native
  sealed trait Module extends ListType
  @scala.inline
  def Module: Module = "Module".asInstanceOf[Module]
  
  @js.native
  sealed trait Multiply
    extends ChannelOperator
       with ComposeOperator
  @scala.inline
  def Multiply: Multiply = "Multiply".asInstanceOf[Multiply]
  
  @js.native
  sealed trait Native extends EndianType
  @scala.inline
  def Native: Native = "Native".asInstanceOf[Native]
  
  @js.native
  sealed trait Negate extends ChannelOperator
  @scala.inline
  def Negate: Negate = "Negate".asInstanceOf[Negate]
  
  @js.native
  sealed trait `Noise-Gaussian` extends ChannelOperator
  @scala.inline
  def `Noise-Gaussian`: `Noise-Gaussian` = "Noise-Gaussian".asInstanceOf[`Noise-Gaussian`]
  
  @js.native
  sealed trait `Noise-Impulse` extends ChannelOperator
  @scala.inline
  def `Noise-Impulse`: `Noise-Impulse` = "Noise-Impulse".asInstanceOf[`Noise-Impulse`]
  
  @js.native
  sealed trait `Noise-Laplacian` extends ChannelOperator
  @scala.inline
  def `Noise-Laplacian`: `Noise-Laplacian` = "Noise-Laplacian".asInstanceOf[`Noise-Laplacian`]
  
  @js.native
  sealed trait `Noise-Multiplicative` extends ChannelOperator
  @scala.inline
  def `Noise-Multiplicative`: `Noise-Multiplicative` = "Noise-Multiplicative".asInstanceOf[`Noise-Multiplicative`]
  
  @js.native
  sealed trait `Noise-Poisson` extends ChannelOperator
  @scala.inline
  def `Noise-Poisson`: `Noise-Poisson` = "Noise-Poisson".asInstanceOf[`Noise-Poisson`]
  
  @js.native
  sealed trait `Noise-Random` extends ChannelOperator
  @scala.inline
  def `Noise-Random`: `Noise-Random` = "Noise-Random".asInstanceOf[`Noise-Random`]
  
  @js.native
  sealed trait `Noise-Uniform` extends ChannelOperator
  @scala.inline
  def `Noise-Uniform`: `Noise-Uniform` = "Noise-Uniform".asInstanceOf[`Noise-Uniform`]
  
  @js.native
  sealed trait None
    extends CompressionType
       with DisposeMethod
       with Encoding
       with InterlaceType
  @scala.inline
  def None: None = "None".asInstanceOf[None]
  
  @js.native
  sealed trait North extends GravityDirection
  @scala.inline
  def North: North = "North".asInstanceOf[North]
  
  @js.native
  sealed trait NorthEast extends GravityDirection
  @scala.inline
  def NorthEast: NorthEast = "NorthEast".asInstanceOf[NorthEast]
  
  @js.native
  sealed trait NorthWest extends GravityDirection
  @scala.inline
  def NorthWest: NorthWest = "NorthWest".asInstanceOf[NorthWest]
  
  @js.native
  sealed trait OHTA extends ColorSpace
  @scala.inline
  def OHTA: OHTA = "OHTA".asInstanceOf[OHTA]
  
  @js.native
  sealed trait OilPaint extends PreviewType
  @scala.inline
  def OilPaint: OilPaint = "OilPaint".asInstanceOf[OilPaint]
  
  @js.native
  sealed trait Opacity
    extends ChannelType
       with NamedColor
  @scala.inline
  def Opacity: Opacity = "Opacity".asInstanceOf[Opacity]
  
  @js.native
  sealed trait Optimize extends ImageType
  @scala.inline
  def Optimize: Optimize = "Optimize".asInstanceOf[Optimize]
  
  @js.native
  sealed trait Or extends ChannelOperator
  @scala.inline
  def Or: Or = "Or".asInstanceOf[Or]
  
  @js.native
  sealed trait Out extends ComposeOperator
  @scala.inline
  def Out: Out = "Out".asInstanceOf[Out]
  
  @js.native
  sealed trait Over extends ComposeOperator
  @scala.inline
  def Over: Over = "Over".asInstanceOf[Over]
  
  @js.native
  sealed trait Palette extends ImageType
  @scala.inline
  def Palette: Palette = "Palette".asInstanceOf[Palette]
  
  @js.native
  sealed trait PaletteMatte extends ImageType
  @scala.inline
  def PaletteMatte: PaletteMatte = "PaletteMatte".asInstanceOf[PaletteMatte]
  
  @js.native
  sealed trait Partition extends InterlaceType
  @scala.inline
  def Partition: Partition = "Partition".asInstanceOf[Partition]
  
  @js.native
  sealed trait Percentsign extends ResizeOption
  @scala.inline
  def Percentsign: Percentsign = "%".asInstanceOf[Percentsign]
  
  @js.native
  sealed trait Perceptual extends IntentType
  @scala.inline
  def Perceptual: Perceptual = "Perceptual".asInstanceOf[Perceptual]
  
  @js.native
  sealed trait PixelsPerCentimeter extends UnitType
  @scala.inline
  def PixelsPerCentimeter: PixelsPerCentimeter = "PixelsPerCentimeter".asInstanceOf[PixelsPerCentimeter]
  
  @js.native
  sealed trait PixelsPerInch extends UnitType
  @scala.inline
  def PixelsPerInch: PixelsPerInch = "PixelsPerInch".asInstanceOf[PixelsPerInch]
  
  @js.native
  sealed trait Plane extends InterlaceType
  @scala.inline
  def Plane: Plane = "Plane".asInstanceOf[Plane]
  
  @js.native
  sealed trait Plus extends ComposeOperator
  @scala.inline
  def Plus: Plus = "Plus".asInstanceOf[Plus]
  
  @js.native
  sealed trait Plussign extends StObject
  @scala.inline
  def Plussign: Plussign = "+".asInstanceOf[Plussign]
  
  @js.native
  sealed trait Point extends FilterType
  @scala.inline
  def Point: Point = "Point".asInstanceOf[Point]
  
  @js.native
  sealed trait Pow extends ChannelOperator
  @scala.inline
  def Pow: Pow = "Pow".asInstanceOf[Pow]
  
  @js.native
  sealed trait Previous extends DisposeMethod
  @scala.inline
  def Previous: Previous = "Previous".asInstanceOf[Previous]
  
  @js.native
  sealed trait PseudoColor extends VisualType
  @scala.inline
  def PseudoColor: PseudoColor = "PseudoColor".asInstanceOf[PseudoColor]
  
  @js.native
  sealed trait Quadratic extends FilterType
  @scala.inline
  def Quadratic: Quadratic = "Quadratic".asInstanceOf[Quadratic]
  
  @js.native
  sealed trait Quantize extends PreviewType
  @scala.inline
  def Quantize: Quantize = "Quantize".asInstanceOf[Quantize]
  
  @js.native
  sealed trait RGB extends ColorSpace
  @scala.inline
  def RGB: RGB = "RGB".asInstanceOf[RGB]
  
  @js.native
  sealed trait RLE extends CompressionType
  @scala.inline
  def RLE: RLE = "RLE".asInstanceOf[RLE]
  
  @js.native
  sealed trait RShift extends ChannelOperator
  @scala.inline
  def RShift: RShift = "RShift".asInstanceOf[RShift]
  
  @js.native
  sealed trait Raise extends PreviewType
  @scala.inline
  def Raise: Raise = "Raise".asInstanceOf[Raise]
  
  @js.native
  sealed trait Rec601Luma extends ColorSpace
  @scala.inline
  def Rec601Luma: Rec601Luma = "Rec601Luma".asInstanceOf[Rec601Luma]
  
  @js.native
  sealed trait Rec601YCbCr extends ColorSpace
  @scala.inline
  def Rec601YCbCr: Rec601YCbCr = "Rec601YCbCr".asInstanceOf[Rec601YCbCr]
  
  @js.native
  sealed trait Rec709Luma extends ColorSpace
  @scala.inline
  def Rec709Luma: Rec709Luma = "Rec709Luma".asInstanceOf[Rec709Luma]
  
  @js.native
  sealed trait Rec709YCbCr extends ColorSpace
  @scala.inline
  def Rec709YCbCr: Rec709YCbCr = "Rec709YCbCr".asInstanceOf[Rec709YCbCr]
  
  @js.native
  sealed trait Red
    extends ChannelType
       with NamedColor
  @scala.inline
  def Red: Red = "Red".asInstanceOf[Red]
  
  @js.native
  sealed trait ReduceNoise extends PreviewType
  @scala.inline
  def ReduceNoise: ReduceNoise = "ReduceNoise".asInstanceOf[ReduceNoise]
  
  @js.native
  sealed trait Relative extends IntentType
  @scala.inline
  def Relative: Relative = "Relative".asInstanceOf[Relative]
  
  @js.native
  sealed trait Resource extends ListType
  @scala.inline
  def Resource: Resource = "Resource".asInstanceOf[Resource]
  
  @js.native
  sealed trait Roll extends PreviewType
  @scala.inline
  def Roll: Roll = "Roll".asInstanceOf[Roll]
  
  @js.native
  sealed trait Rotate extends PreviewType
  @scala.inline
  def Rotate: Rotate = "Rotate".asInstanceOf[Rotate]
  
  @js.native
  sealed trait SJIScode extends Encoding
  @scala.inline
  def SJIScode: SJIScode = "SJIScode".asInstanceOf[SJIScode]
  
  @js.native
  sealed trait Saturation
    extends IntentType
       with PreviewType
  @scala.inline
  def Saturation: Saturation = "Saturation".asInstanceOf[Saturation]
  
  @js.native
  sealed trait Segment extends PreviewType
  @scala.inline
  def Segment: Segment = "Segment".asInstanceOf[Segment]
  
  @js.native
  sealed trait Shade extends PreviewType
  @scala.inline
  def Shade: Shade = "Shade".asInstanceOf[Shade]
  
  @js.native
  sealed trait Sharpen extends PreviewType
  @scala.inline
  def Sharpen: Sharpen = "Sharpen".asInstanceOf[Sharpen]
  
  @js.native
  sealed trait Shear extends PreviewType
  @scala.inline
  def Shear: Shear = "Shear".asInstanceOf[Shear]
  
  @js.native
  sealed trait Sinc extends FilterType
  @scala.inline
  def Sinc: Sinc = "Sinc".asInstanceOf[Sinc]
  
  @js.native
  sealed trait Solarize extends PreviewType
  @scala.inline
  def Solarize: Solarize = "Solarize".asInstanceOf[Solarize]
  
  @js.native
  sealed trait South extends GravityDirection
  @scala.inline
  def South: South = "South".asInstanceOf[South]
  
  @js.native
  sealed trait SouthEast extends GravityDirection
  @scala.inline
  def SouthEast: SouthEast = "SouthEast".asInstanceOf[SouthEast]
  
  @js.native
  sealed trait SouthWest extends GravityDirection
  @scala.inline
  def SouthWest: SouthWest = "SouthWest".asInstanceOf[SouthWest]
  
  @js.native
  sealed trait Spiff extends PreviewType
  @scala.inline
  def Spiff: Spiff = "Spiff".asInstanceOf[Spiff]
  
  @js.native
  sealed trait Spread extends PreviewType
  @scala.inline
  def Spread: Spread = "Spread".asInstanceOf[Spread]
  
  @js.native
  sealed trait StaticColor extends VisualType
  @scala.inline
  def StaticColor: StaticColor = "StaticColor".asInstanceOf[StaticColor]
  
  @js.native
  sealed trait StaticGray extends VisualType
  @scala.inline
  def StaticGray: StaticGray = "StaticGray".asInstanceOf[StaticGray]
  
  @js.native
  sealed trait Subtract
    extends ChannelOperator
       with ComposeOperator
  @scala.inline
  def Subtract: Subtract = "Subtract".asInstanceOf[Subtract]
  
  @js.native
  sealed trait Swirl extends PreviewType
  @scala.inline
  def Swirl: Swirl = "Swirl".asInstanceOf[Swirl]
  
  @js.native
  sealed trait Symbol extends Encoding
  @scala.inline
  def Symbol: Symbol = "Symbol".asInstanceOf[Symbol]
  
  @js.native
  sealed trait Threshold
    extends ChannelOperator
       with HighlightStyle
       with PreviewType
  @scala.inline
  def Threshold: Threshold = "Threshold".asInstanceOf[Threshold]
  
  @js.native
  sealed trait `Threshold-Black` extends ChannelOperator
  @scala.inline
  def `Threshold-Black`: `Threshold-Black` = "Threshold-Black".asInstanceOf[`Threshold-Black`]
  
  @js.native
  sealed trait `Threshold-Black-Negate` extends ChannelOperator
  @scala.inline
  def `Threshold-Black-Negate`: `Threshold-Black-Negate` = "Threshold-Black-Negate".asInstanceOf[`Threshold-Black-Negate`]
  
  @js.native
  sealed trait `Threshold-White` extends ChannelOperator
  @scala.inline
  def `Threshold-White`: `Threshold-White` = "Threshold-White".asInstanceOf[`Threshold-White`]
  
  @js.native
  sealed trait `Threshold-White-Negate` extends ChannelOperator
  @scala.inline
  def `Threshold-White-Negate`: `Threshold-White-Negate` = "Threshold-White-Negate".asInstanceOf[`Threshold-White-Negate`]
  
  @js.native
  sealed trait Tile extends VirtualPixelMethod
  @scala.inline
  def Tile: Tile = "Tile".asInstanceOf[Tile]
  
  @js.native
  sealed trait Tint extends HighlightStyle
  @scala.inline
  def Tint: Tint = "Tint".asInstanceOf[Tint]
  
  @js.native
  sealed trait Transparent extends ColorSpace
  @scala.inline
  def Transparent: Transparent = "Transparent".asInstanceOf[Transparent]
  
  @js.native
  sealed trait Triangle extends FilterType
  @scala.inline
  def Triangle: Triangle = "Triangle".asInstanceOf[Triangle]
  
  @js.native
  sealed trait TrueColor
    extends ImageType
       with VisualType
  @scala.inline
  def TrueColor: TrueColor = "TrueColor".asInstanceOf[TrueColor]
  
  @js.native
  sealed trait TrueColorMatte extends ImageType
  @scala.inline
  def TrueColorMatte: TrueColorMatte = "TrueColorMatte".asInstanceOf[TrueColorMatte]
  
  @js.native
  sealed trait Type extends ListType
  @scala.inline
  def Type: Type = "Type".asInstanceOf[Type]
  
  @js.native
  sealed trait Undefined
    extends DisposeMethod
       with UnitType
  @scala.inline
  def Undefined: Undefined = "Undefined".asInstanceOf[Undefined]
  
  @js.native
  sealed trait Unicode extends Encoding
  @scala.inline
  def Unicode: Unicode = "Unicode".asInstanceOf[Unicode]
  
  @js.native
  sealed trait Wansung extends Encoding
  @scala.inline
  def Wansung: Wansung = "Wansung".asInstanceOf[Wansung]
  
  @js.native
  sealed trait Wave extends PreviewType
  @scala.inline
  def Wave: Wave = "Wave".asInstanceOf[Wave]
  
  @js.native
  sealed trait West extends GravityDirection
  @scala.inline
  def West: West = "West".asInstanceOf[West]
  
  @js.native
  sealed trait XOR extends HighlightStyle
  @scala.inline
  def XOR: XOR = "XOR".asInstanceOf[XOR]
  
  @js.native
  sealed trait XYZ extends ColorSpace
  @scala.inline
  def XYZ: XYZ = "XYZ".asInstanceOf[XYZ]
  
  @js.native
  sealed trait Xor_
    extends ChannelOperator
       with ComposeOperator
  @scala.inline
  def Xor_ : Xor_ = "Xor".asInstanceOf[Xor_]
  
  @js.native
  sealed trait YCbCr extends ColorSpace
  @scala.inline
  def YCbCr: YCbCr = "YCbCr".asInstanceOf[YCbCr]
  
  @js.native
  sealed trait YIQ extends ColorSpace
  @scala.inline
  def YIQ: YIQ = "YIQ".asInstanceOf[YIQ]
  
  @js.native
  sealed trait YPbPr extends ColorSpace
  @scala.inline
  def YPbPr: YPbPr = "YPbPr".asInstanceOf[YPbPr]
  
  @js.native
  sealed trait YUV extends ColorSpace
  @scala.inline
  def YUV: YUV = "YUV".asInstanceOf[YUV]
  
  @js.native
  sealed trait Yellow
    extends ChannelType
       with NamedColor
  @scala.inline
  def Yellow: Yellow = "Yellow".asInstanceOf[Yellow]
  
  @js.native
  sealed trait Zip extends CompressionType
  @scala.inline
  def Zip: Zip = "Zip".asInstanceOf[Zip]
  
  @js.native
  sealed trait center_ extends StObject
  @scala.inline
  def center_ : center_ = "center".asInstanceOf[center_]
  
  @js.native
  sealed trait color_ extends SetDrawProperty
  @scala.inline
  def color_ : color_ = "color".asInstanceOf[color_]
  
  @js.native
  sealed trait concatenate extends OperationMode
  @scala.inline
  def concatenate: concatenate = "concatenate".asInstanceOf[concatenate]
  
  @js.native
  sealed trait disk extends LimitType
  @scala.inline
  def disk: disk = "disk".asInstanceOf[disk]
  
  @js.native
  sealed trait file extends LimitType
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait filltoborder extends SetDrawMethod
  @scala.inline
  def filltoborder: filltoborder = "filltoborder".asInstanceOf[filltoborder]
  
  @js.native
  sealed trait floodfill extends SetDrawMethod
  @scala.inline
  def floodfill: floodfill = "floodfill".asInstanceOf[floodfill]
  
  @js.native
  sealed trait frame extends OperationMode
  @scala.inline
  def frame: frame = "frame".asInstanceOf[frame]
  
  @js.native
  sealed trait gaussian_ extends NoiseType
  @scala.inline
  def gaussian_ : gaussian_ = "gaussian".asInstanceOf[gaussian_]
  
  @js.native
  sealed trait impulse extends NoiseType
  @scala.inline
  def impulse: impulse = "impulse".asInstanceOf[impulse]
  
  @js.native
  sealed trait laplacian extends NoiseType
  @scala.inline
  def laplacian: laplacian = "laplacian".asInstanceOf[laplacian]
  
  @js.native
  sealed trait map extends LimitType
  @scala.inline
  def map: map = "map".asInstanceOf[map]
  
  @js.native
  sealed trait matte_ extends SetDrawProperty
  @scala.inline
  def matte_ : matte_ = "matte".asInstanceOf[matte_]
  
  @js.native
  sealed trait memory extends LimitType
  @scala.inline
  def memory: memory = "memory".asInstanceOf[memory]
  
  @js.native
  sealed trait multiplicative extends NoiseType
  @scala.inline
  def multiplicative: multiplicative = "multiplicative".asInstanceOf[multiplicative]
  
  @js.native
  sealed trait pixels extends LimitType
  @scala.inline
  def pixels: pixels = "pixels".asInstanceOf[pixels]
  
  @js.native
  sealed trait point_ extends SetDrawMethod
  @scala.inline
  def point_ : point_ = "point".asInstanceOf[point_]
  
  @js.native
  sealed trait poisson extends NoiseType
  @scala.inline
  def poisson: poisson = "poisson".asInstanceOf[poisson]
  
  @js.native
  sealed trait `private` extends StObject
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait replace extends SetDrawMethod
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
  
  @js.native
  sealed trait reset extends SetDrawMethod
  @scala.inline
  def reset: reset = "reset".asInstanceOf[reset]
  
  @js.native
  sealed trait shared extends StObject
  @scala.inline
  def shared: shared = "shared".asInstanceOf[shared]
  
  @js.native
  sealed trait threads extends LimitType
  @scala.inline
  def threads: threads = "threads".asInstanceOf[threads]
  
  @js.native
  sealed trait topleft extends StObject
  @scala.inline
  def topleft: topleft = "topleft".asInstanceOf[topleft]
  
  @js.native
  sealed trait unframe extends OperationMode
  @scala.inline
  def unframe: unframe = "unframe".asInstanceOf[unframe]
  
  @js.native
  sealed trait uniform extends NoiseType
  @scala.inline
  def uniform: uniform = "uniform".asInstanceOf[uniform]
}
