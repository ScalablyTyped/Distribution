package typings.glReactDom

import typings.glReactDom.glviewdomMod.SupportedImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object glReactDomStrings {
  @js.native
  sealed trait imageSlashbmp extends SupportedImage
  
  @js.native
  sealed trait imageSlashico extends SupportedImage
  
  @js.native
  sealed trait imageSlashjpeg extends SupportedImage
  
  @js.native
  sealed trait imageSlashpng extends SupportedImage
  
  @js.native
  sealed trait imageSlashwebp extends SupportedImage
  
  @scala.inline
  def imageSlashbmp: imageSlashbmp = "image/bmp".asInstanceOf[imageSlashbmp]
  @scala.inline
  def imageSlashico: imageSlashico = "image/ico".asInstanceOf[imageSlashico]
  @scala.inline
  def imageSlashjpeg: imageSlashjpeg = "image/jpeg".asInstanceOf[imageSlashjpeg]
  @scala.inline
  def imageSlashpng: imageSlashpng = "image/png".asInstanceOf[imageSlashpng]
  @scala.inline
  def imageSlashwebp: imageSlashwebp = "image/webp".asInstanceOf[imageSlashwebp]
}

