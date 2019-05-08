package typings
package googleDashProtoDashFilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-proto-files", JSImport.Namespace)
@js.native
object googleDashProtoDashFilesMod extends js.Object {
  val load: js.Function2[
    /* filename */ java.lang.String, 
    /* options */ js.UndefOr[protobufjsLib.protobufjsMod.IParseOptions], 
    js.Promise[protobufjsLib.protobufjsMod.Root]
  ] = js.native
  val loadSync: js.Function2[
    /* filename */ java.lang.String, 
    /* options */ js.UndefOr[protobufjsLib.protobufjsMod.IParseOptions], 
    protobufjsLib.protobufjsMod.Root
  ] = js.native
  def getProtoPath(paths: java.lang.String*): java.lang.String = js.native
  @js.native
  object appengine extends js.Object {
    var v1: java.lang.String = js.native
  }
  
  @js.native
  object bigtable extends js.Object {
    var admin: googleDashProtoDashFilesLib.Anon_V1 = js.native
    var v1: java.lang.String = js.native
    var v2: java.lang.String = js.native
  }
  
  @js.native
  object cloudtrace extends js.Object {
    var v1: java.lang.String = js.native
  }
  
  @js.native
  object container extends js.Object {
    var v1: java.lang.String = js.native
  }
  
  @js.native
  object datastore extends js.Object {
    var v1: java.lang.String = js.native
    var v1beta3: java.lang.String = js.native
  }
  
  @js.native
  object dlp extends js.Object {
    var v2beta1: java.lang.String = js.native
  }
  
  @js.native
  object embeddedAssistant extends js.Object {
    var v1alpha1: java.lang.String = js.native
    var v1alpha2: java.lang.String = js.native
  }
  
  @js.native
  object firestore extends js.Object {
    var admin: googleDashProtoDashFilesLib.Anon_V1beta1 = js.native
    var v1beta1: java.lang.String = js.native
  }
  
  @js.native
  object functions extends js.Object {
    var v1beta2: java.lang.String = js.native
  }
  
  @js.native
  object iam extends js.Object {
    var admin: googleDashProtoDashFilesLib.Anon_V1String = js.native
    var v1: java.lang.String = js.native
  }
  
  @js.native
  object language extends js.Object {
    var v1: java.lang.String = js.native
    var v1beta1: java.lang.String = js.native
  }
  
  @js.native
  object logging extends js.Object {
    var v2: java.lang.String = js.native
  }
  
  @js.native
  object monitoring extends js.Object {
    var v3: googleDashProtoDashFilesLib.Anon_Group = js.native
  }
  
  @js.native
  object pubsub extends js.Object {
    var v1: java.lang.String = js.native
    var v1beta2: java.lang.String = js.native
  }
  
  @js.native
  object spanner extends js.Object {
    var admin: googleDashProtoDashFilesLib.Anon_V1AnonDatabase = js.native
    var v1: java.lang.String = js.native
  }
  
  @js.native
  object speech extends js.Object {
    var v1: java.lang.String = js.native
    var v1beta1: java.lang.String = js.native
    var v2: java.lang.String = js.native
  }
  
  @js.native
  object storagetransfer extends js.Object {
    var v1: java.lang.String = js.native
  }
  
  @js.native
  object videointelligence extends js.Object {
    var v1beta1: java.lang.String = js.native
  }
  
  @js.native
  object vision extends js.Object {
    var v1: java.lang.String = js.native
  }
  
}

