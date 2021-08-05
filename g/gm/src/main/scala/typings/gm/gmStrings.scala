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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gmStrings {
  
  @js.native
  sealed trait ^
    extends StObject
       with ResizeOption
  inline def ^ : ^ = "^".asInstanceOf[^]
  
  @js.native
  sealed trait default
    extends StObject
       with VisualType
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait `@`
    extends StObject
       with ResizeOption
  inline def `@`: `@` = "@".asInstanceOf[`@`]
  
  @js.native
  sealed trait Absolute
    extends StObject
       with IntentType
  inline def Absolute: Absolute = "Absolute".asInstanceOf[Absolute]
  
  @js.native
  sealed trait Add
    extends StObject
       with ChannelOperator
       with ComposeOperator
  inline def Add: Add = "Add".asInstanceOf[Add]
  
  @js.native
  sealed trait AddNoise
    extends StObject
       with PreviewType
  inline def AddNoise: AddNoise = "AddNoise".asInstanceOf[AddNoise]
  
  @js.native
  sealed trait AdobeCustom
    extends StObject
       with Encoding
  inline def AdobeCustom: AdobeCustom = "AdobeCustom".asInstanceOf[AdobeCustom]
  
  @js.native
  sealed trait AdobeExpert
    extends StObject
       with Encoding
  inline def AdobeExpert: AdobeExpert = "AdobeExpert".asInstanceOf[AdobeExpert]
  
  @js.native
  sealed trait AdobeStandard
    extends StObject
       with Encoding
  inline def AdobeStandard: AdobeStandard = "AdobeStandard".asInstanceOf[AdobeStandard]
  
  @js.native
  sealed trait All
    extends StObject
       with ChannelType
  inline def All: All = "All".asInstanceOf[All]
  
  @js.native
  sealed trait And
    extends StObject
       with ChannelOperator
  inline def And: And = "And".asInstanceOf[And]
  
  @js.native
  sealed trait AppleRoman
    extends StObject
       with Encoding
  inline def AppleRoman: AppleRoman = "AppleRoman".asInstanceOf[AppleRoman]
  
  @js.native
  sealed trait Assign
    extends StObject
       with ChannelOperator
       with HighlightStyle
  inline def Assign: Assign = "Assign".asInstanceOf[Assign]
  
  @js.native
  sealed trait Atop
    extends StObject
       with ComposeOperator
  inline def Atop: Atop = "Atop".asInstanceOf[Atop]
  
  @js.native
  sealed trait BIG5
    extends StObject
       with Encoding
  inline def BIG5: BIG5 = "BIG5".asInstanceOf[BIG5]
  
  @js.native
  sealed trait BZip
    extends StObject
       with CompressionType
  inline def BZip: BZip = "BZip".asInstanceOf[BZip]
  
  @js.native
  sealed trait Background
    extends StObject
       with DisposeMethod
  inline def Background: Background = "Background".asInstanceOf[Background]
  
  @js.native
  sealed trait Bessel
    extends StObject
       with FilterType
  inline def Bessel: Bessel = "Bessel".asInstanceOf[Bessel]
  
  @js.native
  sealed trait Bilevel
    extends StObject
       with ImageType
  inline def Bilevel: Bilevel = "Bilevel".asInstanceOf[Bilevel]
  
  @js.native
  sealed trait Black
    extends StObject
       with ChannelType
       with NamedColor
  inline def Black: Black = "Black".asInstanceOf[Black]
  
  @js.native
  sealed trait Blackman
    extends StObject
       with FilterType
  inline def Blackman: Blackman = "Blackman".asInstanceOf[Blackman]
  
  @js.native
  sealed trait Blue
    extends StObject
       with ChannelType
       with NamedColor
  inline def Blue: Blue = "Blue".asInstanceOf[Blue]
  
  @js.native
  sealed trait Blur
    extends StObject
       with PreviewType
  inline def Blur: Blur = "Blur".asInstanceOf[Blur]
  
  @js.native
  sealed trait Box
    extends StObject
       with FilterType
  inline def Box: Box = "Box".asInstanceOf[Box]
  
  @js.native
  sealed trait Brightness
    extends StObject
       with PreviewType
  inline def Brightness: Brightness = "Brightness".asInstanceOf[Brightness]
  
  @js.native
  sealed trait Bumpmap
    extends StObject
       with ComposeOperator
  inline def Bumpmap: Bumpmap = "Bumpmap".asInstanceOf[Bumpmap]
  
  @js.native
  sealed trait CMYK
    extends StObject
       with ColorSpace
  inline def CMYK: CMYK = "CMYK".asInstanceOf[CMYK]
  
  @js.native
  sealed trait Catrom
    extends StObject
       with FilterType
  inline def Catrom: Catrom = "Catrom".asInstanceOf[Catrom]
  
  @js.native
  sealed trait Center
    extends StObject
       with GravityDirection
  inline def Center: Center = "Center".asInstanceOf[Center]
  
  @js.native
  sealed trait CharcoalDrawing
    extends StObject
       with PreviewType
  inline def CharcoalDrawing: CharcoalDrawing = "CharcoalDrawing".asInstanceOf[CharcoalDrawing]
  
  @js.native
  sealed trait CineonLog
    extends StObject
       with ColorSpace
  inline def CineonLog: CineonLog = "CineonLog".asInstanceOf[CineonLog]
  
  @js.native
  sealed trait Color
    extends StObject
       with ListType
  inline def Color: Color = "Color".asInstanceOf[Color]
  
  @js.native
  sealed trait ColorSeparation
    extends StObject
       with ImageType
  inline def ColorSeparation: ColorSeparation = "ColorSeparation".asInstanceOf[ColorSeparation]
  
  @js.native
  sealed trait ColorSeparationMatte
    extends StObject
       with ImageType
  inline def ColorSeparationMatte: ColorSeparationMatte = "ColorSeparationMatte".asInstanceOf[ColorSeparationMatte]
  
  @js.native
  sealed trait Constant
    extends StObject
       with VirtualPixelMethod
  inline def Constant: Constant = "Constant".asInstanceOf[Constant]
  
  @js.native
  sealed trait Copy
    extends StObject
       with ComposeOperator
  inline def Copy: Copy = "Copy".asInstanceOf[Copy]
  
  @js.native
  sealed trait CopyBlack
    extends StObject
       with ComposeOperator
  inline def CopyBlack: CopyBlack = "CopyBlack".asInstanceOf[CopyBlack]
  
  @js.native
  sealed trait CopyBlue
    extends StObject
       with ComposeOperator
  inline def CopyBlue: CopyBlue = "CopyBlue".asInstanceOf[CopyBlue]
  
  @js.native
  sealed trait CopyCyan
    extends StObject
       with ComposeOperator
  inline def CopyCyan: CopyCyan = "CopyCyan".asInstanceOf[CopyCyan]
  
  @js.native
  sealed trait CopyGreen
    extends StObject
       with ComposeOperator
  inline def CopyGreen: CopyGreen = "CopyGreen".asInstanceOf[CopyGreen]
  
  @js.native
  sealed trait CopyMagenta
    extends StObject
       with ComposeOperator
  inline def CopyMagenta: CopyMagenta = "CopyMagenta".asInstanceOf[CopyMagenta]
  
  @js.native
  sealed trait CopyOpacity
    extends StObject
       with ComposeOperator
  inline def CopyOpacity: CopyOpacity = "CopyOpacity".asInstanceOf[CopyOpacity]
  
  @js.native
  sealed trait CopyRed
    extends StObject
       with ComposeOperator
  inline def CopyRed: CopyRed = "CopyRed".asInstanceOf[CopyRed]
  
  @js.native
  sealed trait CopyYellow
    extends StObject
       with ComposeOperator
  inline def CopyYellow: CopyYellow = "CopyYellow".asInstanceOf[CopyYellow]
  
  @js.native
  sealed trait Cubic
    extends StObject
       with FilterType
  inline def Cubic: Cubic = "Cubic".asInstanceOf[Cubic]
  
  @js.native
  sealed trait Cyan
    extends StObject
       with ChannelType
       with NamedColor
  inline def Cyan: Cyan = "Cyan".asInstanceOf[Cyan]
  
  @js.native
  sealed trait Delegate
    extends StObject
       with ListType
  inline def Delegate: Delegate = "Delegate".asInstanceOf[Delegate]
  
  @js.native
  sealed trait Depth
    extends StObject
       with ChannelOperator
  inline def Depth: Depth = "Depth".asInstanceOf[Depth]
  
  @js.native
  sealed trait Despeckle
    extends StObject
       with PreviewType
  inline def Despeckle: Despeckle = "Despeckle".asInstanceOf[Despeckle]
  
  @js.native
  sealed trait Difference
    extends StObject
       with ComposeOperator
  inline def Difference: Difference = "Difference".asInstanceOf[Difference]
  
  @js.native
  sealed trait DirectColor
    extends StObject
       with VisualType
  inline def DirectColor: DirectColor = "DirectColor".asInstanceOf[DirectColor]
  
  @js.native
  sealed trait Divide
    extends StObject
       with ChannelOperator
       with ComposeOperator
  inline def Divide: Divide = "Divide".asInstanceOf[Divide]
  
  @js.native
  sealed trait Dull
    extends StObject
       with PreviewType
  inline def Dull: Dull = "Dull".asInstanceOf[Dull]
  
  @js.native
  sealed trait East
    extends StObject
       with GravityDirection
  inline def East: East = "East".asInstanceOf[East]
  
  @js.native
  sealed trait Edge
    extends StObject
       with VirtualPixelMethod
  inline def Edge: Edge = "Edge".asInstanceOf[Edge]
  
  @js.native
  sealed trait EdgeDetect
    extends StObject
       with PreviewType
  inline def EdgeDetect: EdgeDetect = "EdgeDetect".asInstanceOf[EdgeDetect]
  
  @js.native
  sealed trait Exclamationmark
    extends StObject
       with ResizeOption
  inline def Exclamationmark: Exclamationmark = "!".asInstanceOf[Exclamationmark]
  
  @js.native
  sealed trait Fax
    extends StObject
       with CompressionType
  inline def Fax: Fax = "Fax".asInstanceOf[Fax]
  
  @js.native
  sealed trait Format
    extends StObject
       with ListType
  inline def Format: Format = "Format".asInstanceOf[Format]
  
  @js.native
  sealed trait GB2312
    extends StObject
       with Encoding
  inline def GB2312: GB2312 = "GB2312".asInstanceOf[GB2312]
  
  @js.native
  sealed trait GRAY
    extends StObject
       with ColorSpace
  inline def GRAY: GRAY = "GRAY".asInstanceOf[GRAY]
  
  @js.native
  sealed trait Gamma
    extends StObject
       with ChannelOperator
       with PreviewType
  inline def Gamma: Gamma = "Gamma".asInstanceOf[Gamma]
  
  @js.native
  sealed trait Gaussian
    extends StObject
       with FilterType
  inline def Gaussian: Gaussian = "Gaussian".asInstanceOf[Gaussian]
  
  @js.native
  sealed trait GrayScale
    extends StObject
       with VisualType
  inline def GrayScale: GrayScale = "GrayScale".asInstanceOf[GrayScale]
  
  @js.native
  sealed trait Gray_
    extends StObject
       with NamedColor
  inline def Gray_ : Gray_ = "Gray".asInstanceOf[Gray_]
  
  @js.native
  sealed trait Grayscale_
    extends StObject
       with ImageType
       with PreviewType
  inline def Grayscale_ : Grayscale_ = "Grayscale".asInstanceOf[Grayscale_]
  
  @js.native
  sealed trait Greaterthansign
    extends StObject
       with ResizeOption
  inline def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait Green
    extends StObject
       with ChannelType
       with NamedColor
  inline def Green: Green = "Green".asInstanceOf[Green]
  
  @js.native
  sealed trait Group4
    extends StObject
       with CompressionType
  inline def Group4: Group4 = "Group4".asInstanceOf[Group4]
  
  @js.native
  sealed trait HSB
    extends StObject
       with ColorSpace
  inline def HSB: HSB = "HSB".asInstanceOf[HSB]
  
  @js.native
  sealed trait HSL
    extends StObject
       with ColorSpace
  inline def HSL: HSL = "HSL".asInstanceOf[HSL]
  
  @js.native
  sealed trait Hamming
    extends StObject
       with FilterType
  inline def Hamming: Hamming = "Hamming".asInstanceOf[Hamming]
  
  @js.native
  sealed trait Hanning
    extends StObject
       with FilterType
  inline def Hanning: Hanning = "Hanning".asInstanceOf[Hanning]
  
  @js.native
  sealed trait Hermite
    extends StObject
       with FilterType
  inline def Hermite: Hermite = "Hermite".asInstanceOf[Hermite]
  
  @js.native
  sealed trait Hue
    extends StObject
       with PreviewType
  inline def Hue: Hue = "Hue".asInstanceOf[Hue]
  
  @js.native
  sealed trait Implode
    extends StObject
       with PreviewType
  inline def Implode: Implode = "Implode".asInstanceOf[Implode]
  
  @js.native
  sealed trait In
    extends StObject
       with ComposeOperator
  inline def In: In = "In".asInstanceOf[In]
  
  @js.native
  sealed trait Intensity
    extends StObject
       with ChannelType
  inline def Intensity: Intensity = "Intensity".asInstanceOf[Intensity]
  
  @js.native
  sealed trait JPEG
    extends StObject
       with CompressionType
       with PreviewType
  inline def JPEG: JPEG = "JPEG".asInstanceOf[JPEG]
  
  @js.native
  sealed trait LSB
    extends StObject
       with EndianType
  inline def LSB: LSB = "LSB".asInstanceOf[LSB]
  
  @js.native
  sealed trait LShift
    extends StObject
       with ChannelOperator
  inline def LShift: LShift = "LShift".asInstanceOf[LShift]
  
  @js.native
  sealed trait LZMA
    extends StObject
       with CompressionType
  inline def LZMA: LZMA = "LZMA".asInstanceOf[LZMA]
  
  @js.native
  sealed trait LZW
    extends StObject
       with CompressionType
  inline def LZW: LZW = "LZW".asInstanceOf[LZW]
  
  @js.native
  sealed trait Lanczos
    extends StObject
       with FilterType
  inline def Lanczos: Lanczos = "Lanczos".asInstanceOf[Lanczos]
  
  @js.native
  sealed trait `Latin 2`
    extends StObject
       with Encoding
  inline def `Latin 2`: `Latin 2` = ("Latin 2").asInstanceOf[`Latin 2`]
  
  @js.native
  sealed trait Lessthansign
    extends StObject
       with ResizeOption
  inline def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait Line
    extends StObject
       with InterlaceType
  inline def Line: Line = "Line".asInstanceOf[Line]
  
  @js.native
  sealed trait Log
    extends StObject
       with ChannelOperator
  inline def Log: Log = "Log".asInstanceOf[Log]
  
  @js.native
  sealed trait Lossless
    extends StObject
       with CompressionType
  inline def Lossless: Lossless = "Lossless".asInstanceOf[Lossless]
  
  @js.native
  sealed trait MSB
    extends StObject
       with EndianType
  inline def MSB: MSB = "MSB".asInstanceOf[MSB]
  
  @js.native
  sealed trait Magenta
    extends StObject
       with ChannelType
       with NamedColor
  inline def Magenta: Magenta = "Magenta".asInstanceOf[Magenta]
  
  @js.native
  sealed trait Magic
    extends StObject
       with ListType
  inline def Magic: Magic = "Magic".asInstanceOf[Magic]
  
  @js.native
  sealed trait Matte
    extends StObject
       with NamedColor
  inline def Matte: Matte = "Matte".asInstanceOf[Matte]
  
  @js.native
  sealed trait Max
    extends StObject
       with ChannelOperator
  inline def Max: Max = "Max".asInstanceOf[Max]
  
  @js.native
  sealed trait Min
    extends StObject
       with ChannelOperator
  inline def Min: Min = "Min".asInstanceOf[Min]
  
  @js.native
  sealed trait Minus
    extends StObject
       with ComposeOperator
  inline def Minus: Minus = "Minus".asInstanceOf[Minus]
  
  @js.native
  sealed trait Mirror
    extends StObject
       with VirtualPixelMethod
  inline def Mirror: Mirror = "Mirror".asInstanceOf[Mirror]
  
  @js.native
  sealed trait Mitchell
    extends StObject
       with FilterType
  inline def Mitchell: Mitchell = "Mitchell".asInstanceOf[Mitchell]
  
  @js.native
  sealed trait Module
    extends StObject
       with ListType
  inline def Module: Module = "Module".asInstanceOf[Module]
  
  @js.native
  sealed trait Multiply
    extends StObject
       with ChannelOperator
       with ComposeOperator
  inline def Multiply: Multiply = "Multiply".asInstanceOf[Multiply]
  
  @js.native
  sealed trait Native
    extends StObject
       with EndianType
  inline def Native: Native = "Native".asInstanceOf[Native]
  
  @js.native
  sealed trait Negate
    extends StObject
       with ChannelOperator
  inline def Negate: Negate = "Negate".asInstanceOf[Negate]
  
  @js.native
  sealed trait `Noise-Gaussian`
    extends StObject
       with ChannelOperator
  inline def `Noise-Gaussian`: `Noise-Gaussian` = "Noise-Gaussian".asInstanceOf[`Noise-Gaussian`]
  
  @js.native
  sealed trait `Noise-Impulse`
    extends StObject
       with ChannelOperator
  inline def `Noise-Impulse`: `Noise-Impulse` = "Noise-Impulse".asInstanceOf[`Noise-Impulse`]
  
  @js.native
  sealed trait `Noise-Laplacian`
    extends StObject
       with ChannelOperator
  inline def `Noise-Laplacian`: `Noise-Laplacian` = "Noise-Laplacian".asInstanceOf[`Noise-Laplacian`]
  
  @js.native
  sealed trait `Noise-Multiplicative`
    extends StObject
       with ChannelOperator
  inline def `Noise-Multiplicative`: `Noise-Multiplicative` = "Noise-Multiplicative".asInstanceOf[`Noise-Multiplicative`]
  
  @js.native
  sealed trait `Noise-Poisson`
    extends StObject
       with ChannelOperator
  inline def `Noise-Poisson`: `Noise-Poisson` = "Noise-Poisson".asInstanceOf[`Noise-Poisson`]
  
  @js.native
  sealed trait `Noise-Random`
    extends StObject
       with ChannelOperator
  inline def `Noise-Random`: `Noise-Random` = "Noise-Random".asInstanceOf[`Noise-Random`]
  
  @js.native
  sealed trait `Noise-Uniform`
    extends StObject
       with ChannelOperator
  inline def `Noise-Uniform`: `Noise-Uniform` = "Noise-Uniform".asInstanceOf[`Noise-Uniform`]
  
  @js.native
  sealed trait None
    extends StObject
       with CompressionType
       with DisposeMethod
       with Encoding
       with InterlaceType
  inline def None: None = "None".asInstanceOf[None]
  
  @js.native
  sealed trait North
    extends StObject
       with GravityDirection
  inline def North: North = "North".asInstanceOf[North]
  
  @js.native
  sealed trait NorthEast
    extends StObject
       with GravityDirection
  inline def NorthEast: NorthEast = "NorthEast".asInstanceOf[NorthEast]
  
  @js.native
  sealed trait NorthWest
    extends StObject
       with GravityDirection
  inline def NorthWest: NorthWest = "NorthWest".asInstanceOf[NorthWest]
  
  @js.native
  sealed trait OHTA
    extends StObject
       with ColorSpace
  inline def OHTA: OHTA = "OHTA".asInstanceOf[OHTA]
  
  @js.native
  sealed trait OilPaint
    extends StObject
       with PreviewType
  inline def OilPaint: OilPaint = "OilPaint".asInstanceOf[OilPaint]
  
  @js.native
  sealed trait Opacity
    extends StObject
       with ChannelType
       with NamedColor
  inline def Opacity: Opacity = "Opacity".asInstanceOf[Opacity]
  
  @js.native
  sealed trait Optimize
    extends StObject
       with ImageType
  inline def Optimize: Optimize = "Optimize".asInstanceOf[Optimize]
  
  @js.native
  sealed trait Or
    extends StObject
       with ChannelOperator
  inline def Or: Or = "Or".asInstanceOf[Or]
  
  @js.native
  sealed trait Out
    extends StObject
       with ComposeOperator
  inline def Out: Out = "Out".asInstanceOf[Out]
  
  @js.native
  sealed trait Over
    extends StObject
       with ComposeOperator
  inline def Over: Over = "Over".asInstanceOf[Over]
  
  @js.native
  sealed trait Palette
    extends StObject
       with ImageType
  inline def Palette: Palette = "Palette".asInstanceOf[Palette]
  
  @js.native
  sealed trait PaletteMatte
    extends StObject
       with ImageType
  inline def PaletteMatte: PaletteMatte = "PaletteMatte".asInstanceOf[PaletteMatte]
  
  @js.native
  sealed trait Partition
    extends StObject
       with InterlaceType
  inline def Partition: Partition = "Partition".asInstanceOf[Partition]
  
  @js.native
  sealed trait Percentsign
    extends StObject
       with ResizeOption
  inline def Percentsign: Percentsign = "%".asInstanceOf[Percentsign]
  
  @js.native
  sealed trait Perceptual
    extends StObject
       with IntentType
  inline def Perceptual: Perceptual = "Perceptual".asInstanceOf[Perceptual]
  
  @js.native
  sealed trait PixelsPerCentimeter
    extends StObject
       with UnitType
  inline def PixelsPerCentimeter: PixelsPerCentimeter = "PixelsPerCentimeter".asInstanceOf[PixelsPerCentimeter]
  
  @js.native
  sealed trait PixelsPerInch
    extends StObject
       with UnitType
  inline def PixelsPerInch: PixelsPerInch = "PixelsPerInch".asInstanceOf[PixelsPerInch]
  
  @js.native
  sealed trait Plane
    extends StObject
       with InterlaceType
  inline def Plane: Plane = "Plane".asInstanceOf[Plane]
  
  @js.native
  sealed trait Plus
    extends StObject
       with ComposeOperator
  inline def Plus: Plus = "Plus".asInstanceOf[Plus]
  
  @js.native
  sealed trait Plussign extends StObject
  inline def Plussign: Plussign = "+".asInstanceOf[Plussign]
  
  @js.native
  sealed trait Point
    extends StObject
       with FilterType
  inline def Point: Point = "Point".asInstanceOf[Point]
  
  @js.native
  sealed trait Pow
    extends StObject
       with ChannelOperator
  inline def Pow: Pow = "Pow".asInstanceOf[Pow]
  
  @js.native
  sealed trait Previous
    extends StObject
       with DisposeMethod
  inline def Previous: Previous = "Previous".asInstanceOf[Previous]
  
  @js.native
  sealed trait PseudoColor
    extends StObject
       with VisualType
  inline def PseudoColor: PseudoColor = "PseudoColor".asInstanceOf[PseudoColor]
  
  @js.native
  sealed trait Quadratic
    extends StObject
       with FilterType
  inline def Quadratic: Quadratic = "Quadratic".asInstanceOf[Quadratic]
  
  @js.native
  sealed trait Quantize
    extends StObject
       with PreviewType
  inline def Quantize: Quantize = "Quantize".asInstanceOf[Quantize]
  
  @js.native
  sealed trait RGB
    extends StObject
       with ColorSpace
  inline def RGB: RGB = "RGB".asInstanceOf[RGB]
  
  @js.native
  sealed trait RLE
    extends StObject
       with CompressionType
  inline def RLE: RLE = "RLE".asInstanceOf[RLE]
  
  @js.native
  sealed trait RShift
    extends StObject
       with ChannelOperator
  inline def RShift: RShift = "RShift".asInstanceOf[RShift]
  
  @js.native
  sealed trait Raise
    extends StObject
       with PreviewType
  inline def Raise: Raise = "Raise".asInstanceOf[Raise]
  
  @js.native
  sealed trait Rec601Luma
    extends StObject
       with ColorSpace
  inline def Rec601Luma: Rec601Luma = "Rec601Luma".asInstanceOf[Rec601Luma]
  
  @js.native
  sealed trait Rec601YCbCr
    extends StObject
       with ColorSpace
  inline def Rec601YCbCr: Rec601YCbCr = "Rec601YCbCr".asInstanceOf[Rec601YCbCr]
  
  @js.native
  sealed trait Rec709Luma
    extends StObject
       with ColorSpace
  inline def Rec709Luma: Rec709Luma = "Rec709Luma".asInstanceOf[Rec709Luma]
  
  @js.native
  sealed trait Rec709YCbCr
    extends StObject
       with ColorSpace
  inline def Rec709YCbCr: Rec709YCbCr = "Rec709YCbCr".asInstanceOf[Rec709YCbCr]
  
  @js.native
  sealed trait Red
    extends StObject
       with ChannelType
       with NamedColor
  inline def Red: Red = "Red".asInstanceOf[Red]
  
  @js.native
  sealed trait ReduceNoise
    extends StObject
       with PreviewType
  inline def ReduceNoise: ReduceNoise = "ReduceNoise".asInstanceOf[ReduceNoise]
  
  @js.native
  sealed trait Relative
    extends StObject
       with IntentType
  inline def Relative: Relative = "Relative".asInstanceOf[Relative]
  
  @js.native
  sealed trait Resource
    extends StObject
       with ListType
  inline def Resource: Resource = "Resource".asInstanceOf[Resource]
  
  @js.native
  sealed trait Roll
    extends StObject
       with PreviewType
  inline def Roll: Roll = "Roll".asInstanceOf[Roll]
  
  @js.native
  sealed trait Rotate
    extends StObject
       with PreviewType
  inline def Rotate: Rotate = "Rotate".asInstanceOf[Rotate]
  
  @js.native
  sealed trait SJIScode
    extends StObject
       with Encoding
  inline def SJIScode: SJIScode = "SJIScode".asInstanceOf[SJIScode]
  
  @js.native
  sealed trait Saturation
    extends StObject
       with IntentType
       with PreviewType
  inline def Saturation: Saturation = "Saturation".asInstanceOf[Saturation]
  
  @js.native
  sealed trait Segment
    extends StObject
       with PreviewType
  inline def Segment: Segment = "Segment".asInstanceOf[Segment]
  
  @js.native
  sealed trait Shade
    extends StObject
       with PreviewType
  inline def Shade: Shade = "Shade".asInstanceOf[Shade]
  
  @js.native
  sealed trait Sharpen
    extends StObject
       with PreviewType
  inline def Sharpen: Sharpen = "Sharpen".asInstanceOf[Sharpen]
  
  @js.native
  sealed trait Shear
    extends StObject
       with PreviewType
  inline def Shear: Shear = "Shear".asInstanceOf[Shear]
  
  @js.native
  sealed trait Sinc
    extends StObject
       with FilterType
  inline def Sinc: Sinc = "Sinc".asInstanceOf[Sinc]
  
  @js.native
  sealed trait Solarize
    extends StObject
       with PreviewType
  inline def Solarize: Solarize = "Solarize".asInstanceOf[Solarize]
  
  @js.native
  sealed trait South
    extends StObject
       with GravityDirection
  inline def South: South = "South".asInstanceOf[South]
  
  @js.native
  sealed trait SouthEast
    extends StObject
       with GravityDirection
  inline def SouthEast: SouthEast = "SouthEast".asInstanceOf[SouthEast]
  
  @js.native
  sealed trait SouthWest
    extends StObject
       with GravityDirection
  inline def SouthWest: SouthWest = "SouthWest".asInstanceOf[SouthWest]
  
  @js.native
  sealed trait Spiff
    extends StObject
       with PreviewType
  inline def Spiff: Spiff = "Spiff".asInstanceOf[Spiff]
  
  @js.native
  sealed trait Spread
    extends StObject
       with PreviewType
  inline def Spread: Spread = "Spread".asInstanceOf[Spread]
  
  @js.native
  sealed trait StaticColor
    extends StObject
       with VisualType
  inline def StaticColor: StaticColor = "StaticColor".asInstanceOf[StaticColor]
  
  @js.native
  sealed trait StaticGray
    extends StObject
       with VisualType
  inline def StaticGray: StaticGray = "StaticGray".asInstanceOf[StaticGray]
  
  @js.native
  sealed trait Subtract
    extends StObject
       with ChannelOperator
       with ComposeOperator
  inline def Subtract: Subtract = "Subtract".asInstanceOf[Subtract]
  
  @js.native
  sealed trait Swirl
    extends StObject
       with PreviewType
  inline def Swirl: Swirl = "Swirl".asInstanceOf[Swirl]
  
  @js.native
  sealed trait Symbol
    extends StObject
       with Encoding
  inline def Symbol: Symbol = "Symbol".asInstanceOf[Symbol]
  
  @js.native
  sealed trait Threshold
    extends StObject
       with ChannelOperator
       with HighlightStyle
       with PreviewType
  inline def Threshold: Threshold = "Threshold".asInstanceOf[Threshold]
  
  @js.native
  sealed trait `Threshold-Black`
    extends StObject
       with ChannelOperator
  inline def `Threshold-Black`: `Threshold-Black` = "Threshold-Black".asInstanceOf[`Threshold-Black`]
  
  @js.native
  sealed trait `Threshold-Black-Negate`
    extends StObject
       with ChannelOperator
  inline def `Threshold-Black-Negate`: `Threshold-Black-Negate` = "Threshold-Black-Negate".asInstanceOf[`Threshold-Black-Negate`]
  
  @js.native
  sealed trait `Threshold-White`
    extends StObject
       with ChannelOperator
  inline def `Threshold-White`: `Threshold-White` = "Threshold-White".asInstanceOf[`Threshold-White`]
  
  @js.native
  sealed trait `Threshold-White-Negate`
    extends StObject
       with ChannelOperator
  inline def `Threshold-White-Negate`: `Threshold-White-Negate` = "Threshold-White-Negate".asInstanceOf[`Threshold-White-Negate`]
  
  @js.native
  sealed trait Tile
    extends StObject
       with VirtualPixelMethod
  inline def Tile: Tile = "Tile".asInstanceOf[Tile]
  
  @js.native
  sealed trait Tint
    extends StObject
       with HighlightStyle
  inline def Tint: Tint = "Tint".asInstanceOf[Tint]
  
  @js.native
  sealed trait Transparent
    extends StObject
       with ColorSpace
  inline def Transparent: Transparent = "Transparent".asInstanceOf[Transparent]
  
  @js.native
  sealed trait Triangle
    extends StObject
       with FilterType
  inline def Triangle: Triangle = "Triangle".asInstanceOf[Triangle]
  
  @js.native
  sealed trait TrueColor
    extends StObject
       with ImageType
       with VisualType
  inline def TrueColor: TrueColor = "TrueColor".asInstanceOf[TrueColor]
  
  @js.native
  sealed trait TrueColorMatte
    extends StObject
       with ImageType
  inline def TrueColorMatte: TrueColorMatte = "TrueColorMatte".asInstanceOf[TrueColorMatte]
  
  @js.native
  sealed trait Type
    extends StObject
       with ListType
  inline def Type: Type = "Type".asInstanceOf[Type]
  
  @js.native
  sealed trait Undefined
    extends StObject
       with DisposeMethod
       with UnitType
  inline def Undefined: Undefined = "Undefined".asInstanceOf[Undefined]
  
  @js.native
  sealed trait Unicode
    extends StObject
       with Encoding
  inline def Unicode: Unicode = "Unicode".asInstanceOf[Unicode]
  
  @js.native
  sealed trait Wansung
    extends StObject
       with Encoding
  inline def Wansung: Wansung = "Wansung".asInstanceOf[Wansung]
  
  @js.native
  sealed trait Wave
    extends StObject
       with PreviewType
  inline def Wave: Wave = "Wave".asInstanceOf[Wave]
  
  @js.native
  sealed trait West
    extends StObject
       with GravityDirection
  inline def West: West = "West".asInstanceOf[West]
  
  @js.native
  sealed trait XOR
    extends StObject
       with HighlightStyle
  inline def XOR: XOR = "XOR".asInstanceOf[XOR]
  
  @js.native
  sealed trait XYZ
    extends StObject
       with ColorSpace
  inline def XYZ: XYZ = "XYZ".asInstanceOf[XYZ]
  
  @js.native
  sealed trait Xor_
    extends StObject
       with ChannelOperator
       with ComposeOperator
  inline def Xor_ : Xor_ = "Xor".asInstanceOf[Xor_]
  
  @js.native
  sealed trait YCbCr
    extends StObject
       with ColorSpace
  inline def YCbCr: YCbCr = "YCbCr".asInstanceOf[YCbCr]
  
  @js.native
  sealed trait YIQ
    extends StObject
       with ColorSpace
  inline def YIQ: YIQ = "YIQ".asInstanceOf[YIQ]
  
  @js.native
  sealed trait YPbPr
    extends StObject
       with ColorSpace
  inline def YPbPr: YPbPr = "YPbPr".asInstanceOf[YPbPr]
  
  @js.native
  sealed trait YUV
    extends StObject
       with ColorSpace
  inline def YUV: YUV = "YUV".asInstanceOf[YUV]
  
  @js.native
  sealed trait Yellow
    extends StObject
       with ChannelType
       with NamedColor
  inline def Yellow: Yellow = "Yellow".asInstanceOf[Yellow]
  
  @js.native
  sealed trait Zip
    extends StObject
       with CompressionType
  inline def Zip: Zip = "Zip".asInstanceOf[Zip]
  
  @js.native
  sealed trait center_ extends StObject
  inline def center_ : center_ = "center".asInstanceOf[center_]
  
  @js.native
  sealed trait color_
    extends StObject
       with SetDrawProperty
  inline def color_ : color_ = "color".asInstanceOf[color_]
  
  @js.native
  sealed trait concatenate
    extends StObject
       with OperationMode
  inline def concatenate: concatenate = "concatenate".asInstanceOf[concatenate]
  
  @js.native
  sealed trait disk
    extends StObject
       with LimitType
  inline def disk: disk = "disk".asInstanceOf[disk]
  
  @js.native
  sealed trait file
    extends StObject
       with LimitType
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait filltoborder
    extends StObject
       with SetDrawMethod
  inline def filltoborder: filltoborder = "filltoborder".asInstanceOf[filltoborder]
  
  @js.native
  sealed trait floodfill
    extends StObject
       with SetDrawMethod
  inline def floodfill: floodfill = "floodfill".asInstanceOf[floodfill]
  
  @js.native
  sealed trait frame
    extends StObject
       with OperationMode
  inline def frame: frame = "frame".asInstanceOf[frame]
  
  @js.native
  sealed trait gaussian_
    extends StObject
       with NoiseType
  inline def gaussian_ : gaussian_ = "gaussian".asInstanceOf[gaussian_]
  
  @js.native
  sealed trait impulse
    extends StObject
       with NoiseType
  inline def impulse: impulse = "impulse".asInstanceOf[impulse]
  
  @js.native
  sealed trait laplacian
    extends StObject
       with NoiseType
  inline def laplacian: laplacian = "laplacian".asInstanceOf[laplacian]
  
  @js.native
  sealed trait map
    extends StObject
       with LimitType
  inline def map: map = "map".asInstanceOf[map]
  
  @js.native
  sealed trait matte_
    extends StObject
       with SetDrawProperty
  inline def matte_ : matte_ = "matte".asInstanceOf[matte_]
  
  @js.native
  sealed trait memory
    extends StObject
       with LimitType
  inline def memory: memory = "memory".asInstanceOf[memory]
  
  @js.native
  sealed trait multiplicative
    extends StObject
       with NoiseType
  inline def multiplicative: multiplicative = "multiplicative".asInstanceOf[multiplicative]
  
  @js.native
  sealed trait pixels
    extends StObject
       with LimitType
  inline def pixels: pixels = "pixels".asInstanceOf[pixels]
  
  @js.native
  sealed trait point_
    extends StObject
       with SetDrawMethod
  inline def point_ : point_ = "point".asInstanceOf[point_]
  
  @js.native
  sealed trait poisson
    extends StObject
       with NoiseType
  inline def poisson: poisson = "poisson".asInstanceOf[poisson]
  
  @js.native
  sealed trait `private` extends StObject
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait replace
    extends StObject
       with SetDrawMethod
  inline def replace: replace = "replace".asInstanceOf[replace]
  
  @js.native
  sealed trait reset
    extends StObject
       with SetDrawMethod
  inline def reset: reset = "reset".asInstanceOf[reset]
  
  @js.native
  sealed trait shared extends StObject
  inline def shared: shared = "shared".asInstanceOf[shared]
  
  @js.native
  sealed trait threads
    extends StObject
       with LimitType
  inline def threads: threads = "threads".asInstanceOf[threads]
  
  @js.native
  sealed trait topleft extends StObject
  inline def topleft: topleft = "topleft".asInstanceOf[topleft]
  
  @js.native
  sealed trait unframe
    extends StObject
       with OperationMode
  inline def unframe: unframe = "unframe".asInstanceOf[unframe]
  
  @js.native
  sealed trait uniform
    extends StObject
       with NoiseType
  inline def uniform: uniform = "uniform".asInstanceOf[uniform]
}
