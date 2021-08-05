package typings.gcsResumableUpload

import typings.gcsResumableUpload.mod.PredefinedAcl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gcsResumableUploadStrings {
  
  @js.native
  sealed trait Asterisk extends StObject
  inline def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  
  @js.native
  sealed trait authenticatedRead
    extends StObject
       with PredefinedAcl
  inline def authenticatedRead: authenticatedRead = "authenticatedRead".asInstanceOf[authenticatedRead]
  
  @js.native
  sealed trait bucketOwnerFullControl
    extends StObject
       with PredefinedAcl
  inline def bucketOwnerFullControl: bucketOwnerFullControl = "bucketOwnerFullControl".asInstanceOf[bucketOwnerFullControl]
  
  @js.native
  sealed trait bucketOwnerRead
    extends StObject
       with PredefinedAcl
  inline def bucketOwnerRead: bucketOwnerRead = "bucketOwnerRead".asInstanceOf[bucketOwnerRead]
  
  @js.native
  sealed trait full extends StObject
  inline def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait noAcl extends StObject
  inline def noAcl: noAcl = "noAcl".asInstanceOf[noAcl]
  
  @js.native
  sealed trait `private`
    extends StObject
       with PredefinedAcl
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait projectPrivate
    extends StObject
       with PredefinedAcl
  inline def projectPrivate: projectPrivate = "projectPrivate".asInstanceOf[projectPrivate]
  
  @js.native
  sealed trait publicRead
    extends StObject
       with PredefinedAcl
  inline def publicRead: publicRead = "publicRead".asInstanceOf[publicRead]
}
