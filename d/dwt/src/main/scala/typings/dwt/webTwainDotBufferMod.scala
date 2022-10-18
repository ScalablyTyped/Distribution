package typings.dwt

import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTImageType
import typings.dwt.webTwainDotIOMod.WebTwainIO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webTwainDotBufferMod {
  
  @js.native
  trait WebTwainBuffer
    extends StObject
       with WebTwainIO {
    
    /**
      * Return the current deviation of the pixels in the image.
      */
    val BlankImageCurrentStdDev: Double = js.native
    
    /**
      * Return or set the standard deviation of the pixels in the image.
      */
    var BlankImageMaxStdDev: Double = js.native
    
    /**
      * Return or set the dividing line between black and white. The default value is 128.
      */
    var BlankImageThreshold: Double = js.native
    
    /**
      * Return or set how much physical memory is allowed for storing images currently loaded in Dynamic Web TWAIN. Once the limit is reached, images will be cached on the hard disk.
      */
    var BufferMemoryLimit: Double = js.native
    
    /**
      * Remove all tags from the specified image.
      * @param index Specify the image.
      */
    def ClearImageTags(index: Double): Boolean = js.native
    
    /**
      * Return or set the current index of image in the buffer.
      */
    var CurrentImageIndexInBuffer: Double = js.native
    
    /**
      * Filter images by the specified tag.
      * @param tag The tag used as the filter.
      */
    def FilterImagesByTag(tag: String): Boolean = js.native
    
    /**
      * Return the pixel bit depth of the specified image.
      * @param index Specify the image.
      */
    def GetImageBitDepth(index: Double): Double = js.native
    
    /**
      * Return the height (in pixels) of the specified image.
      * @param index Specify the image.
      */
    def GetImageHeight(index: Double): Double = js.native
    
    /**
      * Return the internal URL of the specified image. If width and height are not specified,
      * you get the original image, otherwise you get the image with specified width or height
      * while keeping the same aspect ratio. The returned string is like this
      * 'dwt://dwt_trial_13000404/img?id=306159652&index=0&t=1502184632022'.
      * @param index Specify the image.
      * @param width the width of the image, it must be 150 or bigger
      * @param height the height of the image, it must be 150 or bigger
      */
    def GetImagePartURL(index: Double): String = js.native
    def GetImagePartURL(index: Double, width: Double): String = js.native
    def GetImagePartURL(index: Double, width: Double, height: Double): String = js.native
    def GetImagePartURL(index: Double, width: Unit, height: Double): String = js.native
    
    /**
      * Calculate the size in bytes of the specified image assuming it's resized to the given dimensions.
      * @param index Specify the image.
      * @param width Specify the width.
      * @param height Specify the height.
      */
    def GetImageSize(index: Double, width: Double, height: Double): Double = js.native
    
    def GetImageSizeWithSpecifiedType(index: Double, `type`: Double): Double = js.native
    /**
      * Calculate the size in bytes of the specified image assuming an expected file type.
      * @param index Specify the image.
      * @param type Sepcify the expected file type.
      */
    def GetImageSizeWithSpecifiedType(index: Double, `type`: EnumDWTImageType): Double = js.native
    
    /**
      * Return the direct URL of the specified image, if width or height is set to -1,
      * you get the original image, otherwise you get the image with specified width or
      * height while keeping the same aspect ratio.
      * @param index Specify the image.
      * @param width Specify the width.
      * @param height Specify the height.
      */
    def GetImageURL(index: Double): String = js.native
    def GetImageURL(index: Double, width: Double): String = js.native
    def GetImageURL(index: Double, width: Double, height: Double): String = js.native
    def GetImageURL(index: Double, width: Unit, height: Double): String = js.native
    
    /**
      * Return the width (in pixels) of the specified image.
      * @param index Specify the image.
      */
    def GetImageWidth(index: Double): Double = js.native
    
    /**
      * Return the horizontal resolution of the specified image.
      * @param index Specify the image.
      */
    def GetImageXResolution(index: Double): Double = js.native
    
    /**
      * Return the vertical resolution of the specified image.
      * @param index Specify the image.
      */
    def GetImageYResolution(index: Double): Double = js.native
    
    /**
      * [Deprecation] Return an index from the selected indices array. Read SelectedImagesIndices instead.
      * [Alternative] Read SelectedImagesIndices instead.
      * @param indexOfIndices Specify the index of the specified image.
      */
    def GetSelectedImageIndex(indexOfIndices: Double): Double = js.native
    
    def GetSelectedImagesSize(`type`: Double): Double = js.native
    /**
      * Calculate the size in bytes of all selected images assuming an expected file type.
      * @param type Sepcify the expected file type.
      */
    def GetSelectedImagesSize(`type`: EnumDWTImageType): Double = js.native
    
    /**
      * Return the skew angle of the specified image.
      * @param index Specify the image.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument angle The skew angle.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def GetSkewAngle(index: Double): Double | Unit = js.native
    def GetSkewAngle(index: Double, successCallback: js.Function1[/* angle */ Double, Unit]): Double | Unit = js.native
    def GetSkewAngle(
      index: Double,
      successCallback: js.Function1[/* angle */ Double, Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Double | Unit = js.native
    def GetSkewAngle(
      index: Double,
      successCallback: Unit,
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Double | Unit = js.native
    
    /**
      * Return the skew angle of the specified rectangle on the specified image.
      * @param index Specify the image.
      * @param left The x-coordinate of the upper-left corner of the rectangle.
      * @param top The y-coordinate of the upper-left corner of the rectangle.
      * @param right The x-coordinate of the lower-right corner of the rectangle.
      * @param bottom The y-coordinate of the lower-right corner of the rectangle.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument angle The skew angle.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def GetSkewAngleEx(index: Double, left: Double, top: Double, right: Double, bottom: Double): Double | Unit = js.native
    def GetSkewAngleEx(
      index: Double,
      left: Double,
      top: Double,
      right: Double,
      bottom: Double,
      successCallback: js.Function1[/* angle */ Double, Unit]
    ): Double | Unit = js.native
    def GetSkewAngleEx(
      index: Double,
      left: Double,
      top: Double,
      right: Double,
      bottom: Double,
      successCallback: js.Function1[/* angle */ Double, Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Double | Unit = js.native
    def GetSkewAngleEx(
      index: Double,
      left: Double,
      top: Double,
      right: Double,
      bottom: Double,
      successCallback: Unit,
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Double | Unit = js.native
    
    /**
      * Return how many images are held in the buffer
      */
    val HowManyImagesInBuffer: Double = js.native
    
    /**
      * Return or set whether the feature of disk caching is enabled.
      */
    var IfAllowLocalCache: Boolean = js.native
    
    /**
      * Return the index of an image specified by the imageId.
      * @param imageId The imageId of the image.
      */
    def ImageIDToIndex(imageId: Double): Double = js.native
    
    /**
      * Return the imageId of an image specified by the index.
      * @param index The index of the image.
      */
    def IndexToImageID(index: Double): Double = js.native
    
    /**
      * Check whether the specified image is blank.
      * @param index Specify the image.
      */
    def IsBlankImage(index: Double): Boolean = js.native
    
    /**
      * [Deprecation] Detect whether a certain area on an image is blank.
      * [Alternative] Use IsBlankImage or IsBlankImageExpress instead.
      * @param index Specify the image.
      * @param left The x-coordinate of the upper-left corner of the rectangle.
      * @param top The y-coordinate of the upper-left corner of the rectangle.
      * @param right The x-coordinate of the lower-right corner of the rectangle.
      * @param bottom The y-coordinate of the lower-right corner of the rectangle.
      * @param bFuzzyMatch Specify whether use fuzzy matching when detecting.
      */
    def IsBlankImageEx(index: Double, left: Double, top: Double, right: Double, bottom: Double, bFuzzyMatch: Boolean): Boolean = js.native
    
    /**
      * Check whether the specified image is blank.
      * @param index Specify the image.
      */
    def IsBlankImageExpress(index: Double): Boolean = js.native
    
    /**
      * Return or set how many images can be held in the buffer.
      */
    var MaxImagesInBuffer: Double = js.native
    
    /**
      * Change the position of an image in the buffer.
      * @param from Specify the original position by index.
      * @param to Specify the target position by index.
      */
    def MoveImage(from: Double, to: Double): Boolean = js.native
    
    /**
      * Remove all images in the buffer.
      */
    def RemoveAllImages(): Boolean = js.native
    
    /**
      * Remove the selected images in the buffer.
      */
    def RemoveAllSelectedImages(): Boolean = js.native
    
    /**
      * Remove the specified image.
      * @param index Specify the image.
      */
    def RemoveImage(index: Double): Boolean = js.native
    
    /**
      * Select all images and return the indices.
      */
    def SelectAllImages(): js.Array[Double] = js.native
    
    /**
      * Select the specified images.
      * @param indices Specify one or multiple images.
      */
    def SelectImages(indices: js.Array[Double]): Boolean = js.native
    
    /**
      * [Deprecation] Return how many images are selected.
      * [Alternative] Read the length of SelectedImagesIndices instead.
      */
    var SelectedImagesCount: Double = js.native
    
    /**
      * Return the indices of the selected images.
      */
    val SelectedImagesIndices: js.Array[Double] = js.native
    
    /**
      * Specify a aspect ratio to be used when selecting a rectangle on an image.
      */
    var SelectionRectAspectRatio: Double = js.native
    
    /**
      * Set a default tag for newlay acquired images.
      * @param tag Specifies the tag.
      */
    def SetDefaultTag(tag: String): Boolean = js.native
    
    /**
      * [Deprecation] You can use the method to select images programatically.
      * [Alternative] Use SelectImages() or SelectAllImages() instead.
      * @param indexOfIndices The index of an array that holds the indices of selected images.
      * @param index The index of an image that you want to select.
      */
    def SetSelectedImageIndex(indexOfIndices: Double, index: Double): Boolean = js.native
    
    /**
      * Exchange the positions of two images.
      * @param index1 Specify the 1st image.
      * @param index2 Specify the 2nd image.
      */
    def SwitchImage(index1: Double, index2: Double): Boolean = js.native
    
    /**
      * Add a tag to specified images.
      * @param indices Specifies images to be tagged.
      * @param tag Specify the tag.
      */
    def TagImages(indices: js.Array[Double], tag: String): Boolean = js.native
  }
}
