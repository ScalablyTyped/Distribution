package typings.googleCloudStorage

import typings.googleCloudStorage.resumableUploadMod.PredefinedAcl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleCloudStorageStrings {
  
  @js.native
  sealed trait ACTIVE extends StObject
  inline def ACTIVE: ACTIVE = "ACTIVE".asInstanceOf[ACTIVE]
  
  @js.native
  sealed trait Asterisk extends StObject
  inline def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  
  @js.native
  sealed trait DELETE extends StObject
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET extends StObject
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait INACTIVE extends StObject
  inline def INACTIVE: INACTIVE = "INACTIVE".asInstanceOf[INACTIVE]
  
  @js.native
  sealed trait POST extends StObject
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT extends StObject
  inline def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait authenticatedRead
    extends StObject
       with PredefinedAcl
       with typings.googleCloudStorage.fileMod.PredefinedAcl
  inline def authenticatedRead: authenticatedRead = "authenticatedRead".asInstanceOf[authenticatedRead]
  
  @js.native
  sealed trait bucketOwnerFullControl
    extends StObject
       with PredefinedAcl
       with typings.googleCloudStorage.fileMod.PredefinedAcl
  inline def bucketOwnerFullControl: bucketOwnerFullControl = "bucketOwnerFullControl".asInstanceOf[bucketOwnerFullControl]
  
  @js.native
  sealed trait bucketOwnerRead
    extends StObject
       with PredefinedAcl
       with typings.googleCloudStorage.fileMod.PredefinedAcl
  inline def bucketOwnerRead: bucketOwnerRead = "bucketOwnerRead".asInstanceOf[bucketOwnerRead]
  
  @js.native
  sealed trait crc32c extends StObject
  inline def crc32c: crc32c = "crc32c".asInstanceOf[crc32c]
  
  @js.native
  sealed trait delete_ extends StObject
  inline def delete_ : delete_ = "delete".asInstanceOf[delete_]
  
  @js.native
  sealed trait full extends StObject
  inline def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait list extends StObject
  inline def list: list = "list".asInstanceOf[list]
  
  @js.native
  sealed trait md5 extends StObject
  inline def md5: md5 = "md5".asInstanceOf[md5]
  
  @js.native
  sealed trait noAcl extends StObject
  inline def noAcl: noAcl = "noAcl".asInstanceOf[noAcl]
  
  @js.native
  sealed trait `private`
    extends StObject
       with PredefinedAcl
       with typings.googleCloudStorage.fileMod.PredefinedAcl
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait projectPrivate
    extends StObject
       with PredefinedAcl
       with typings.googleCloudStorage.fileMod.PredefinedAcl
  inline def projectPrivate: projectPrivate = "projectPrivate".asInstanceOf[projectPrivate]
  
  @js.native
  sealed trait publicRead
    extends StObject
       with PredefinedAcl
       with typings.googleCloudStorage.fileMod.PredefinedAcl
  inline def publicRead: publicRead = "publicRead".asInstanceOf[publicRead]
  
  @js.native
  sealed trait read extends StObject
  inline def read: read = "read".asInstanceOf[read]
  
  @js.native
  sealed trait resumable extends StObject
  inline def resumable: resumable = "resumable".asInstanceOf[resumable]
  
  @js.native
  sealed trait v2 extends StObject
  inline def v2: v2 = "v2".asInstanceOf[v2]
  
  @js.native
  sealed trait v4 extends StObject
  inline def v4: v4 = "v4".asInstanceOf[v4]
  
  @js.native
  sealed trait write extends StObject
  inline def write: write = "write".asInstanceOf[write]
}
