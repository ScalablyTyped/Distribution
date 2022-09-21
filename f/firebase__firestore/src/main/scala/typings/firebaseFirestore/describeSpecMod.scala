package typings.firebaseFirestore

import typings.firebaseFirestore.specBuilderMod.SpecBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeSpecMod {
  
  @JSImport("@firebase/firestore/dist/firestore/test/unit/specs/describe_spec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/test/unit/specs/describe_spec", "MULTI_CLIENT_TAG")
  @js.native
  val MULTI_CLIENT_TAG: /* "multi-client" */ String = js.native
  
  inline def describeSpec(name: String, tags: js.Array[String], builder: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describeSpec")(name.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], builder.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setSpecJSONHandler(writer: js.Function1[/* json */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSpecJSONHandler")(writer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def specTest(name: String, tags: js.Array[String], builder: js.Function0[SpecBuilder]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("specTest")(name.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], builder.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def specTest(name: String, tags: js.Array[String], comment: String, builder: js.Function0[SpecBuilder]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("specTest")(name.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], comment.asInstanceOf[js.Any], builder.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
