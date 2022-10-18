package typings.firebaseFirestore

import typings.firebaseFirestore.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcUtilAssertMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/util/assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debugAssert(assertion: Boolean, message: String): /* asserts assertion */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("debugAssert")(assertion.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts assertion */ Boolean]
  
  inline def debugCast[T](obj: js.Object, constructor: Instantiable[T]): T | scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("debugCast")(obj.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any])).asInstanceOf[T | scala.Nothing]
  
  inline def fail(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")().asInstanceOf[scala.Nothing]
  inline def fail(failure: String): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(failure.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  inline def hardAssert(assertion: Boolean): /* asserts assertion */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hardAssert")(assertion.asInstanceOf[js.Any]).asInstanceOf[/* asserts assertion */ Boolean]
  inline def hardAssert(assertion: Boolean, message: String): /* asserts assertion */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hardAssert")(assertion.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts assertion */ Boolean]
}
