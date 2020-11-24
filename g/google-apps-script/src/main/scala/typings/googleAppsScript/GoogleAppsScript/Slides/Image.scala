package typings.googleAppsScript.GoogleAppsScript.Slides

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import typings.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A PageElement representing an image.
  */
@js.native
trait Image extends js.Object {
  
  def alignOnPage(alignmentPosition: AlignmentPosition): Image = js.native
  
  def bringForward(): Image = js.native
  
  def bringToFront(): Image = js.native
  
  def duplicate(): PageElement = js.native
  
  def getAs(contentType: String): Blob = js.native
  
  def getBlob(): Blob = js.native
  
  def getBorder(): Border = js.native
  
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  
  def getContentUrl(): String = js.native
  
  def getDescription(): String = js.native
  
  def getHeight(): Double = js.native
  
  def getInherentHeight(): Double = js.native
  
  def getInherentWidth(): Double = js.native
  
  def getLeft(): Double = js.native
  
  def getLink(): Link = js.native
  
  def getObjectId(): String = js.native
  
  def getPageElementType(): PageElementType = js.native
  
  def getParentGroup(): Group = js.native
  
  def getParentPage(): Page = js.native
  
  def getRotation(): Double = js.native
  
  def getSourceUrl(): String = js.native
  
  def getTitle(): String = js.native
  
  def getTop(): Double = js.native
  
  def getTransform(): AffineTransform = js.native
  
  def getWidth(): Double = js.native
  
  def preconcatenateTransform(transform: AffineTransform): Image = js.native
  
  def remove(): Unit = js.native
  
  def removeLink(): Unit = js.native
  
  def replace(blobSource: BlobSource): Image = js.native
  def replace(blobSource: BlobSource, crop: Boolean): Image = js.native
  def replace(imageUrl: String): Image = js.native
  def replace(imageUrl: String, crop: Boolean): Image = js.native
  
  def scaleHeight(ratio: Double): Image = js.native
  
  def scaleWidth(ratio: Double): Image = js.native
  
  def select(): Unit = js.native
  def select(replace: Boolean): Unit = js.native
  
  def sendBackward(): Image = js.native
  
  def sendToBack(): Image = js.native
  
  def setDescription(description: String): Image = js.native
  
  def setHeight(height: Double): Image = js.native
  
  def setLeft(left: Double): Image = js.native
  
  def setLinkSlide(slideIndex: Integer): Link = js.native
  def setLinkSlide(slidePosition: SlidePosition): Link = js.native
  def setLinkSlide(slide: Slide): Link = js.native
  
  def setLinkUrl(url: String): Link = js.native
  
  def setRotation(angle: Double): Image = js.native
  
  def setTitle(title: String): Image = js.native
  
  def setTop(top: Double): Image = js.native
  
  def setTransform(transform: AffineTransform): Image = js.native
  
  def setWidth(width: Double): Image = js.native
}
