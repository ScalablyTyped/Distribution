package typings.embroiderSharedInternals

import typings.embroiderSharedInternals.anon.Package
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBabelFilterMod {
  
  @JSImport("@embroider/shared-internals/src/babel-filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(skipBabel: js.Array[Package], appRoot: String): js.Function1[/* filename */ String, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(skipBabel.asInstanceOf[js.Any], appRoot.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* filename */ String, Boolean]]
}
