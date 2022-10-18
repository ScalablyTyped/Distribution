package typings.dwt

import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTInterpolationMethod
import typings.dwt.webTwainDotBufferMod.WebTwainBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webTwainDotEditMod {
  
  @js.native
  trait WebTwainEdit
    extends StObject
       with WebTwainBuffer {
    
    /**
      * [Deprecation] Add text on an image.
      * [Alternative] Annotation feature to be added in a later version.
      * @param index  the index of the image that you want to add text to.
      * @param x the x coordinate for the text.
      * @param y the y coordinate for the text.
      * @param text the content of the text that you want to add.
      * @param txtColor  the color for the text.
      * @param backgroundColor  the background color.
      * @param backgroundRoundRadius ranging from 0 to 0.5. Please NOTE that MAC version does not support this parameter.
      * @param backgroundOpacity specifies the opacity of the background of the added text, it ranges from 0 to 1.0. Please NOTE that Mac version only supports value 0 and 1
      */
    def AddText(
      index: Double,
      x: Double,
      y: Double,
      text: String,
      txtColor: Double,
      backgroundColor: Double,
      backgroundRoundRadius: Double,
      backgroundOpacity: Double
    ): Boolean = js.native
    
    /**
      * Return or set the fill colour for the empty area on an image that has been cut/cropped/erased.
      */
    var BackgroundFillColor: Double = js.native
    
    /**
      * Change the bit depth of the specified image.
      * @param index Specify the image.
      * @param bitDepth Specify the bit depth.
      * @param highQuality Whether to keep high quality.
      */
    def ChangeBitDepth(index: Double, bitDepth: Double, highQuality: Boolean): Boolean = js.native
    
    def ChangeImageSize(index: Double, width: Double, height: Double, method: Double): Unit | Boolean = js.native
    def ChangeImageSize(index: Double, width: Double, height: Double, method: Double, successCallback: js.Function0[Unit]): Unit | Boolean = js.native
    def ChangeImageSize(
      index: Double,
      width: Double,
      height: Double,
      method: Double,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    def ChangeImageSize(
      index: Double,
      width: Double,
      height: Double,
      method: Double,
      successCallback: Unit,
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    /**
      * Change the size of the specified image.
      * @param index Specify the image.
      * @param width Specify the new width.
      * @param height Specify the new height.
      * @param method Specify the algorithm for the change.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def ChangeImageSize(index: Double, width: Double, height: Double, method: EnumDWTInterpolationMethod): Unit | Boolean = js.native
    def ChangeImageSize(
      index: Double,
      width: Double,
      height: Double,
      method: EnumDWTInterpolationMethod,
      successCallback: js.Function0[Unit]
    ): Unit | Boolean = js.native
    def ChangeImageSize(
      index: Double,
      width: Double,
      height: Double,
      method: EnumDWTInterpolationMethod,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    def ChangeImageSize(
      index: Double,
      width: Double,
      height: Double,
      method: EnumDWTInterpolationMethod,
      successCallback: Unit,
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    
    /**
      * Convert the specified image to black & white.
      * @param index Specify the image.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def ConvertToBW(index: Double): Unit | Boolean = js.native
    def ConvertToBW(index: Double, successCallback: js.Function0[Unit]): Unit | Boolean = js.native
    def ConvertToBW(
      index: Double,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    def ConvertToBW(
      index: Double,
      successCallback: Unit,
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    
    /**
      * Convert the specified image to grayscale.
      * @param index Specify the image.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def ConvertToGrayScale(index: Double): Unit | Boolean = js.native
    def ConvertToGrayScale(index: Double, successCallback: js.Function0[Unit]): Unit | Boolean = js.native
    def ConvertToGrayScale(
      index: Double,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    def ConvertToGrayScale(
      index: Double,
      successCallback: Unit,
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    
    /**
      * Copy the specified image to the clipboard of the operating system.
      * @param index Specify the image.
      */
    def CopyToClipboard(index: Double): Boolean = js.native
    
    /**
      * [Deprecation] Create the font for adding text using the method AddText.
      * [Alternative] Annotation feature to be added in a later version.
      * @param height Specifies the desired height (in logical units) of the font.
      * The absolute value of nHeight must not exceed 16,384 device units after it is converted.
      * For all height comparisons, the font mapper looks for the largest font that does not
      * exceed the requested size or the smallest font if all the fonts exceed the requested size.
      * @param width Specifies the average width (in logical units) of characters in the font.
      * If Width is 0, the aspect ratio of the device will be matched against the digitization
      * aspect ratio of the available fonts to find the closest match, which is determined by the
      * absolute value of the difference.
      * @param escapement Specifies the angle (in 0.1-degree units) between the escapement vector
      * and the x-axis of the display surface. The escapement vector is the line through the origins
      * of the first and last characters on a line. The angle is measured counterclockwise from the x-axis.
      * @param orientation Specifies the angle (in 0.1-degree units) between the baseline of a character
      * and the x-axis.The angle is measured counterclockwise from the x-axis for coordinate systems
      * in which the y-direction is down and clockwise from the x-axis for coordinate systems in which
      * the y-direction is up.
      * @param weight Specifies the font weight (in inked pixels per 1000). The described valuesare
      * approximate; the actual appearance depends on the typeface. Some fonts haveonly FW_NORMAL,
      * FW_REGULAR, and FW_BOLD weights. If FW_DONTCARE is specified, a default weight is used.
      * @param italic  Specifies an italic font if set to TRUE.
      * @param underline Specifies an underlined font if set to TRUE.
      * @param strikeOut A strikeout font if set to TRUE.
      * @param charSet Specifies the font's character set. The OEM character set is system-dependent.
      * Fonts with other character sets may exist in the system. An application that uses a font with
      * an unknown character set must not attempt to translate or interpret strings that are to be
      * rendered with that font.
      * @param outputPrecision Specifies the desired output precision. The output precision defines
      * how closely the output must match the requested font's height, width, character orientation,
      * escapement, and pitch.
      * @param clipPrecision Specifies the desired clipping precision. The clipping precision defines
      * how to clip characters that are partially outside the clipping region.
      * @param quality Specifies the font's output quality, which defines how carefully the GDI must
      * attempt to match the logical-font attributes to those of an actual physical font.
      * @param pitchAndFamily The pitch and family of the font.
      * @param faceName The typeface name, the length of this string must not exceed 32 characters,
      * including the terminating null character.
      */
    def CreateTextFont(
      height: Double,
      width: Double,
      escapement: Double,
      orientation: Double,
      weight: Double,
      italic: Double,
      underline: Double,
      strikeOut: Double,
      charSet: Double,
      outputPrecision: Double,
      clipPrecision: Double,
      quality: Double,
      pitchAndFamily: Double,
      faceName: String
    ): Boolean = js.native
    
    /**
      * Crop the specified image using the specified coordinates.
      * @param index Specify the image.
      * @param left Specify the rectangle (leftmost coordinate).
      * @param top Specify the rectangle (topmost coordinate).
      * @param right Specify the rectangle (rightmost coordinate).
      * @param bottom Specify the rectangle (bottommost coordinate).
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def Crop(index: Double, left: Double, top: Double, right: Double, bottom: Double): Unit | Boolean = js.native
    def Crop(
      index: Double,
      left: Double,
      top: Double,
      right: Double,
      bottom: Double,
      successCallback: js.Function0[Unit]
    ): Unit | Boolean = js.native
    def Crop(
      index: Double,
      left: Double,
      top: Double,
      right: Double,
      bottom: Double,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    def Crop(
      index: Double,
      left: Double,
      top: Double,
      right: Double,
      bottom: Double,
      successCallback: Unit,
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    
    /**
      * Crop a rectangular area from the specified image to the clipboard of the operating system.
      * @param index Specify the image.
      * @param left Specify the rectangle (leftmost coordinate).
      * @param top Specify the rectangle (topmost coordinate).
      * @param right Specify the rectangle (rightmost coordinate).
      * @param bottom Specify the rectangle (bottommost coordinate).
      */
    def CropToClipboard(index: Double, left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
    
    /**
      * Cut a rectangular area from the specified image to the clipboard of the operating system.
      * @param index Specify the image.
      * @param left Specify the rectangle (leftmost coordinate).
      * @param top Specify the rectangle (topmost coordinate).
      * @param right Specify the rectangle (rightmost coordinate).
      * @param bottom Specify the rectangle (bottommost coordinate).
      */
    def CutFrameToClipboard(index: Double, left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
    
    /**
      * Cut the specified image to the clipboard of the operating system.
      * @param index Specify the image.
      */
    def CutToClipboard(index: Double): Boolean = js.native
    
    /**
      * Erase a rectangular area from the specified image.
      * @param index Specify the image.
      * @param left Specify the rectangle (leftmost coordinate).
      * @param top Specify the rectangle (topmost coordinate).
      * @param right Specify the rectangle (rightmost coordinate).
      * @param bottom Specify the rectangle (bottommost coordinate).
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def Erase(index: Double, left: Double, top: Double, right: Double, bottom: Double): Unit | Boolean = js.native
    def Erase(
      index: Double,
      left: Double,
      top: Double,
      right: Double,
      bottom: Double,
      successCallback: js.Function0[Unit]
    ): Unit | Boolean = js.native
    def Erase(
      index: Double,
      left: Double,
      top: Double,
      right: Double,
      bottom: Double,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    def Erase(
      index: Double,
      left: Double,
      top: Double,
      right: Double,
      bottom: Double,
      successCallback: Unit,
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    
    /**
      * Flip the specified image.
      * @param index Specify the image.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def Flip(index: Double): Unit | Boolean = js.native
    def Flip(index: Double, successCallback: js.Function0[Unit]): Unit | Boolean = js.native
    def Flip(
      index: Double,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    def Flip(
      index: Double,
      successCallback: Unit,
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    
    /**
      * Invert the colour of the pixels on the specified image.
      * @param index Specify the image.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def Invert(index: Double): Unit | Boolean = js.native
    def Invert(index: Double, successCallback: js.Function0[Unit]): Unit | Boolean = js.native
    def Invert(
      index: Double,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    def Invert(
      index: Double,
      successCallback: Unit,
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    
    /**
      * Mirror the specified image.
      * @param index Specify the image.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def Mirror(index: Double): Unit | Boolean = js.native
    def Mirror(index: Double, successCallback: js.Function0[Unit]): Unit | Boolean = js.native
    def Mirror(
      index: Double,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    def Mirror(
      index: Double,
      successCallback: Unit,
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    
    /**
      * [Deprecation] Decorates image of a specified index in buffer with rectangles of transparent color.
      * [Alternative] Annotation feature to be added in a later version.
      * @param index specifies the index of image in buffer. The index is 0-based.
      * @param left Specify the rectangle (leftmost coordinate).
      * @param top Specify the rectangle (topmost coordinate).
      * @param right Specify the rectangle (rightmost coordinate).
      * @param bottom Specify the rectangle (bottommost coordinate).
      * @param color Specifies the fill color of the rectangle. The byte-ordering of the RGB value is 0xBBGGRR. BB represents blue, GG represents green, RR represents red.
      * @param fOpacity Specifies the opacity of the rectangle. The value represents opacity. 1.0 is 100% opaque and 0.0 is totally transparent.
      */
    def OverlayRectangle(
      index: Double,
      left: Double,
      top: Double,
      right: Double,
      bottom: Double,
      color: Double,
      fOpacity: Double
    ): Boolean = js.native
    
    /**
      * Rotate the specified image by the specified angle.
      * @param index Specify the image.
      * @param angle Specify the angle.
      * @param keepSize Whether to keep the original size.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def Rotate(index: Double, angle: Double, keepSize: Boolean): Unit | Boolean = js.native
    def Rotate(index: Double, angle: Double, keepSize: Boolean, successCallback: js.Function0[Unit]): Unit | Boolean = js.native
    def Rotate(
      index: Double,
      angle: Double,
      keepSize: Boolean,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    def Rotate(
      index: Double,
      angle: Double,
      keepSize: Boolean,
      successCallback: Unit,
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    
    def RotateEx(index: Double, angle: Double, keepSize: Boolean, method: Double): Unit | Boolean = js.native
    def RotateEx(
      index: Double,
      angle: Double,
      keepSize: Boolean,
      method: Double,
      successCallback: js.Function0[Unit]
    ): Unit | Boolean = js.native
    def RotateEx(
      index: Double,
      angle: Double,
      keepSize: Boolean,
      method: Double,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    def RotateEx(
      index: Double,
      angle: Double,
      keepSize: Boolean,
      method: Double,
      successCallback: Unit,
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    /**
      * Rotate the specified image by the specified angle.
      * @param index Specify the image.
      * @param angle Specify the angle.
      * @param keepSize Whether to keep the original size.
      * @param method Specify the algorithm for the change.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def RotateEx(index: Double, angle: Double, keepSize: Boolean, method: EnumDWTInterpolationMethod): Unit | Boolean = js.native
    def RotateEx(
      index: Double,
      angle: Double,
      keepSize: Boolean,
      method: EnumDWTInterpolationMethod,
      successCallback: js.Function0[Unit]
    ): Unit | Boolean = js.native
    def RotateEx(
      index: Double,
      angle: Double,
      keepSize: Boolean,
      method: EnumDWTInterpolationMethod,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    def RotateEx(
      index: Double,
      angle: Double,
      keepSize: Boolean,
      method: EnumDWTInterpolationMethod,
      successCallback: Unit,
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    
    /**
      * Rotate the specified image 90 degrees counterclockwise.
      * @param index Specify the image.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def RotateLeft(index: Double): Unit | Boolean = js.native
    def RotateLeft(index: Double, successCallback: js.Function0[Unit]): Unit | Boolean = js.native
    def RotateLeft(
      index: Double,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    def RotateLeft(
      index: Double,
      successCallback: Unit,
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    
    /**
      * Rotate the specified image 90 degrees clockwise.
      * @param index Specify the image.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def RotateRight(index: Double): Unit | Boolean = js.native
    def RotateRight(index: Double, successCallback: js.Function0[Unit]): Unit | Boolean = js.native
    def RotateRight(
      index: Double,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    def RotateRight(
      index: Double,
      successCallback: Unit,
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    
    def SetDPI(index: Double, xResolution: Double, yResolution: Double, resample: Boolean, method: Double): Unit | Boolean = js.native
    def SetDPI(
      index: Double,
      xResolution: Double,
      yResolution: Double,
      resample: Boolean,
      method: Double,
      successCallback: js.Function0[Unit]
    ): Unit | Boolean = js.native
    def SetDPI(
      index: Double,
      xResolution: Double,
      yResolution: Double,
      resample: Boolean,
      method: Double,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    def SetDPI(
      index: Double,
      xResolution: Double,
      yResolution: Double,
      resample: Boolean,
      method: Double,
      successCallback: Unit,
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    /**
      * Change the DPI (dots per inch) of the specified image.
      * @param index Specify the image.
      * @param xResolution Specify the horizontal DPI.
      * @param yResolution Specify the vertical DPI.
      * @param resample Whether to resample the image.
      * @param method Specify the algorithm for the change.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def SetDPI(
      index: Double,
      xResolution: Double,
      yResolution: Double,
      resample: Boolean,
      method: EnumDWTInterpolationMethod
    ): Unit | Boolean = js.native
    def SetDPI(
      index: Double,
      xResolution: Double,
      yResolution: Double,
      resample: Boolean,
      method: EnumDWTInterpolationMethod,
      successCallback: js.Function0[Unit]
    ): Unit | Boolean = js.native
    def SetDPI(
      index: Double,
      xResolution: Double,
      yResolution: Double,
      resample: Boolean,
      method: EnumDWTInterpolationMethod,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    def SetDPI(
      index: Double,
      xResolution: Double,
      yResolution: Double,
      resample: Boolean,
      method: EnumDWTInterpolationMethod,
      successCallback: Unit,
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    
    /**
      * Change the width of the specified image by adding a margin or removing part of the image.
      * @param index Specify the image.
      * @param width Specify the new width.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def SetImageWidth(index: Double, width: Double): Unit | Boolean = js.native
    def SetImageWidth(index: Double, width: Double, successCallback: js.Function0[Unit]): Unit | Boolean = js.native
    def SetImageWidth(
      index: Double,
      width: Double,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    def SetImageWidth(
      index: Double,
      width: Double,
      successCallback: Unit,
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit | Boolean = js.native
    
    /**
      * Show the built-in image editor. If called without any arguments while the editor is open, it'll close the editor.
      * @param divId Specify a div element to hold the editor.
      * @param width Specify the width of the editor.
      * @param height Specify the height of the editor.
      */
    def ShowImageEditor(): Boolean = js.native
    def ShowImageEditor(divId: String): Boolean = js.native
    def ShowImageEditor(divId: String, width: Double): Boolean = js.native
    def ShowImageEditor(divId: String, width: Double, height: Double): Boolean = js.native
    def ShowImageEditor(divId: String, width: Unit, height: Double): Boolean = js.native
    def ShowImageEditor(divId: Unit, width: Double): Boolean = js.native
    def ShowImageEditor(divId: Unit, width: Double, height: Double): Boolean = js.native
    def ShowImageEditor(divId: Unit, width: Unit, height: Double): Boolean = js.native
  }
}
