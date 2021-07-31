package typings.gcsResumableUpload

import typings.gcsResumableUpload.mod.PredefinedAcl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gcsResumableUploadStrings {
  
  @js.native
  sealed trait Asterisk extends StObject
  @scala.inline
  def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  
  @js.native
  sealed trait authenticatedRead
    extends StObject
       with PredefinedAcl
  @scala.inline
  def authenticatedRead: authenticatedRead = "authenticatedRead".asInstanceOf[authenticatedRead]
  
  @js.native
  sealed trait bucketOwnerFullControl
    extends StObject
       with PredefinedAcl
  @scala.inline
  def bucketOwnerFullControl: bucketOwnerFullControl = "bucketOwnerFullControl".asInstanceOf[bucketOwnerFullControl]
  
  @js.native
  sealed trait bucketOwnerRead
    extends StObject
       with PredefinedAcl
  @scala.inline
  def bucketOwnerRead: bucketOwnerRead = "bucketOwnerRead".asInstanceOf[bucketOwnerRead]
  
  @js.native
  sealed trait full extends StObject
  @scala.inline
  def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait noAcl extends StObject
  @scala.inline
  def noAcl: noAcl = "noAcl".asInstanceOf[noAcl]
  
  @js.native
  sealed trait `private`
    extends StObject
       with PredefinedAcl
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait projectPrivate
    extends StObject
       with PredefinedAcl
  @scala.inline
  def projectPrivate: projectPrivate = "projectPrivate".asInstanceOf[projectPrivate]
  
  @js.native
  sealed trait publicRead
    extends StObject
       with PredefinedAcl
  @scala.inline
  def publicRead: publicRead = "publicRead".asInstanceOf[publicRead]
}
