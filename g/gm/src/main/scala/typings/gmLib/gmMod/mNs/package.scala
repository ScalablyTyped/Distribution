package typings
package gmLib.gmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mNs {
  type ChannelOperator = gmLib.gmLibStrings.Add | gmLib.gmLibStrings.And | gmLib.gmLibStrings.Assign | gmLib.gmLibStrings.Depth | gmLib.gmLibStrings.Divide | gmLib.gmLibStrings.Gamma | gmLib.gmLibStrings.Negate | gmLib.gmLibStrings.LShift | gmLib.gmLibStrings.Log | gmLib.gmLibStrings.Max | gmLib.gmLibStrings.Min | gmLib.gmLibStrings.Multiply | gmLib.gmLibStrings.Or | gmLib.gmLibStrings.Pow | gmLib.gmLibStrings.RShift | gmLib.gmLibStrings.Subtract | gmLib.gmLibStrings.Threshold | gmLib.gmLibStrings.`Threshold-White` | gmLib.gmLibStrings.`Threshold-White-Negate` | gmLib.gmLibStrings.`Threshold-Black` | gmLib.gmLibStrings.`Threshold-Black-Negate` | gmLib.gmLibStrings.Xor | gmLib.gmLibStrings.`Noise-Gaussian` | gmLib.gmLibStrings.`Noise-Impulse` | gmLib.gmLibStrings.`Noise-Laplacian` | gmLib.gmLibStrings.`Noise-Multiplicative` | gmLib.gmLibStrings.`Noise-Poisson` | gmLib.gmLibStrings.`Noise-Random` | gmLib.gmLibStrings.`Noise-Uniform`
  type ChannelType = gmLib.gmLibStrings.All | gmLib.gmLibStrings.Intensity | gmLib.gmLibStrings.Red | gmLib.gmLibStrings.Green | gmLib.gmLibStrings.Blue | gmLib.gmLibStrings.Cyan | gmLib.gmLibStrings.Magenta | gmLib.gmLibStrings.Yellow | gmLib.gmLibStrings.Black | gmLib.gmLibStrings.Opacity
  type ColorSpace = gmLib.gmLibStrings.CineonLog | gmLib.gmLibStrings.CMYK | gmLib.gmLibStrings.GRAY | gmLib.gmLibStrings.HSL | gmLib.gmLibStrings.HSB | gmLib.gmLibStrings.OHTA | gmLib.gmLibStrings.RGB | gmLib.gmLibStrings.Rec601Luma | gmLib.gmLibStrings.Rec709Luma | gmLib.gmLibStrings.Rec601YCbCr | gmLib.gmLibStrings.Rec709YCbCr | gmLib.gmLibStrings.Transparent | gmLib.gmLibStrings.XYZ | gmLib.gmLibStrings.YCbCr | gmLib.gmLibStrings.YIQ | gmLib.gmLibStrings.YPbPr | gmLib.gmLibStrings.YUV
  type CompareCallback = js.Function4[
    /* err */ nodeLib.Error, 
    /* isEqual */ scala.Boolean, 
    /* equality */ scala.Double, 
    /* raw */ scala.Double, 
    js.Any
  ]
  type ComposeOperator = gmLib.gmLibStrings.Over | gmLib.gmLibStrings.In | gmLib.gmLibStrings.Out | gmLib.gmLibStrings.Atop | gmLib.gmLibStrings.Xor | gmLib.gmLibStrings.Plus | gmLib.gmLibStrings.Minus | gmLib.gmLibStrings.Add | gmLib.gmLibStrings.Subtract | gmLib.gmLibStrings.Difference | gmLib.gmLibStrings.Divide | gmLib.gmLibStrings.Multiply | gmLib.gmLibStrings.Bumpmap | gmLib.gmLibStrings.Copy | gmLib.gmLibStrings.CopyRed | gmLib.gmLibStrings.CopyGreen | gmLib.gmLibStrings.CopyBlue | gmLib.gmLibStrings.CopyOpacity | gmLib.gmLibStrings.CopyCyan | gmLib.gmLibStrings.CopyMagenta | gmLib.gmLibStrings.CopyYellow | gmLib.gmLibStrings.CopyBlack
  type CompressionType = gmLib.gmLibStrings.None | gmLib.gmLibStrings.BZip | gmLib.gmLibStrings.Fax | gmLib.gmLibStrings.Group4 | gmLib.gmLibStrings.JPEG | gmLib.gmLibStrings.Lossless | gmLib.gmLibStrings.LZW | gmLib.gmLibStrings.RLE | gmLib.gmLibStrings.Zip | gmLib.gmLibStrings.LZMA
  type DisposeMethod = gmLib.gmLibStrings.Undefined | gmLib.gmLibStrings.None | gmLib.gmLibStrings.Background | gmLib.gmLibStrings.Previous
  type Encoding = gmLib.gmLibStrings.AdobeCustom | gmLib.gmLibStrings.AdobeExpert | gmLib.gmLibStrings.AdobeStandard | gmLib.gmLibStrings.AppleRoman | gmLib.gmLibStrings.BIG5 | gmLib.gmLibStrings.GB2312 | (gmLib.gmLibStrings.`Latin 2`) | gmLib.gmLibStrings.None | gmLib.gmLibStrings.SJIScode | gmLib.gmLibStrings.Symbol | gmLib.gmLibStrings.Unicode | gmLib.gmLibStrings.Wansung
  type EndianType = gmLib.gmLibStrings.MSB | gmLib.gmLibStrings.LSB | gmLib.gmLibStrings.Native
  type FilterType = gmLib.gmLibStrings.Point | gmLib.gmLibStrings.Box | gmLib.gmLibStrings.Triangle | gmLib.gmLibStrings.Hermite | gmLib.gmLibStrings.Hanning | gmLib.gmLibStrings.Hamming | gmLib.gmLibStrings.Blackman | gmLib.gmLibStrings.Gaussian | gmLib.gmLibStrings.Quadratic | gmLib.gmLibStrings.Cubic | gmLib.gmLibStrings.Catrom | gmLib.gmLibStrings.Mitchell | gmLib.gmLibStrings.Lanczos | gmLib.gmLibStrings.Bessel | gmLib.gmLibStrings.Sinc
  type GetterCallback[T] = js.Function2[/* err */ nodeLib.Error, /* value */ T, js.Any]
  type GravityDirection = gmLib.gmLibStrings.NorthWest | gmLib.gmLibStrings.North | gmLib.gmLibStrings.NorthEast | gmLib.gmLibStrings.West | gmLib.gmLibStrings.Center | gmLib.gmLibStrings.East | gmLib.gmLibStrings.SouthWest | gmLib.gmLibStrings.South | gmLib.gmLibStrings.SouthEast
  type HighlightStyle = gmLib.gmLibStrings.Assign | gmLib.gmLibStrings.Threshold | gmLib.gmLibStrings.Tint | gmLib.gmLibStrings.XOR
  type ImageType = gmLib.gmLibStrings.Bilevel | gmLib.gmLibStrings.Grayscale | gmLib.gmLibStrings.Palette | gmLib.gmLibStrings.PaletteMatte | gmLib.gmLibStrings.TrueColor | gmLib.gmLibStrings.TrueColorMatte | gmLib.gmLibStrings.ColorSeparation | gmLib.gmLibStrings.ColorSeparationMatte | gmLib.gmLibStrings.Optimize
  type IntentType = gmLib.gmLibStrings.Absolute | gmLib.gmLibStrings.Perceptual | gmLib.gmLibStrings.Relative | gmLib.gmLibStrings.Saturation
  type InterlaceType = gmLib.gmLibStrings.None | gmLib.gmLibStrings.Line | gmLib.gmLibStrings.Plane | gmLib.gmLibStrings.Partition
  type LimitType = gmLib.gmLibStrings.disk | gmLib.gmLibStrings.file | gmLib.gmLibStrings.map | gmLib.gmLibStrings.memory | gmLib.gmLibStrings.pixels | gmLib.gmLibStrings.threads
  type ListType = gmLib.gmLibStrings.Color | gmLib.gmLibStrings.Delegate | gmLib.gmLibStrings.Format | gmLib.gmLibStrings.Magic | gmLib.gmLibStrings.Module | gmLib.gmLibStrings.Resource | gmLib.gmLibStrings.Type
  type NamedColor = gmLib.gmLibStrings.Red | gmLib.gmLibStrings.Green | gmLib.gmLibStrings.Blue | gmLib.gmLibStrings.Opacity | gmLib.gmLibStrings.Matte | gmLib.gmLibStrings.Cyan | gmLib.gmLibStrings.Magenta | gmLib.gmLibStrings.Yellow | gmLib.gmLibStrings.Black | gmLib.gmLibStrings.Gray
  type NoiseType = gmLib.gmLibStrings.uniform | gmLib.gmLibStrings.gaussian | gmLib.gmLibStrings.multiplicative | gmLib.gmLibStrings.impulse | gmLib.gmLibStrings.laplacian | gmLib.gmLibStrings.poisson
  type OperationMode = gmLib.gmLibStrings.frame | gmLib.gmLibStrings.unframe | gmLib.gmLibStrings.concatenate
  type PreviewType = gmLib.gmLibStrings.Rotate | gmLib.gmLibStrings.Shear | gmLib.gmLibStrings.Roll | gmLib.gmLibStrings.Hue | gmLib.gmLibStrings.Saturation | gmLib.gmLibStrings.Brightness | gmLib.gmLibStrings.Gamma | gmLib.gmLibStrings.Spiff | gmLib.gmLibStrings.Dull | gmLib.gmLibStrings.Grayscale | gmLib.gmLibStrings.Quantize | gmLib.gmLibStrings.Despeckle | gmLib.gmLibStrings.ReduceNoise | gmLib.gmLibStrings.AddNoise | gmLib.gmLibStrings.Sharpen | gmLib.gmLibStrings.Blur | gmLib.gmLibStrings.Threshold | gmLib.gmLibStrings.EdgeDetect | gmLib.gmLibStrings.Spread | gmLib.gmLibStrings.Shade | gmLib.gmLibStrings.Raise | gmLib.gmLibStrings.Segment | gmLib.gmLibStrings.Solarize | gmLib.gmLibStrings.Swirl | gmLib.gmLibStrings.Implode | gmLib.gmLibStrings.Wave | gmLib.gmLibStrings.OilPaint | gmLib.gmLibStrings.CharcoalDrawing | gmLib.gmLibStrings.JPEG
  type ResizeOption = gmLib.gmLibStrings.`%` | gmLib.gmLibStrings.`@` | gmLib.gmLibStrings.`!` | gmLib.gmLibStrings.`^` | gmLib.gmLibStrings.`<` | gmLib.gmLibStrings.`>`
  type SetDrawMethod = gmLib.gmLibStrings.point | gmLib.gmLibStrings.replace | gmLib.gmLibStrings.floodfill | gmLib.gmLibStrings.filltoborder | gmLib.gmLibStrings.reset
  type SetDrawProperty = gmLib.gmLibStrings.color | gmLib.gmLibStrings.matte
  type UnitType = gmLib.gmLibStrings.Undefined | gmLib.gmLibStrings.PixelsPerInch | gmLib.gmLibStrings.PixelsPerCentimeter
  type VirtualPixelMethod = gmLib.gmLibStrings.Constant | gmLib.gmLibStrings.Edge | gmLib.gmLibStrings.Mirror | gmLib.gmLibStrings.Tile
  type VisualType = gmLib.gmLibStrings.StaticGray | gmLib.gmLibStrings.GrayScale | gmLib.gmLibStrings.StaticColor | gmLib.gmLibStrings.PseudoColor | gmLib.gmLibStrings.TrueColor | gmLib.gmLibStrings.DirectColor | gmLib.gmLibStrings.default
  type WriteCallback = js.Function4[
    /* err */ nodeLib.Error, 
    /* stdout */ java.lang.String, 
    /* stderr */ java.lang.String, 
    /* cmd */ java.lang.String, 
    js.Any
  ]
}
