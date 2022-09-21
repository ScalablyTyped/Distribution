package typings.emscriptenLibraryDecorator

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("emscripten-library-decorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defineHidden(): js.Function2[/* target */ js.Object, /* key */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineHidden")().asInstanceOf[js.Function2[/* target */ js.Object, /* key */ String, Unit]]
  inline def defineHidden(value: Any): js.Function2[/* target */ js.Object, /* key */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineHidden")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* key */ String, Unit]]
  
  inline def dep(depList: ((js.Function1[/* repeated */ Any, Any]) | String)*): js.Function2[/* target */ js.Object, /* functionName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("dep")(depList.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function2[/* target */ js.Object, /* functionName */ String, Unit]]
  
  inline def exportLibrary(target: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exportLibrary")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def `extends`(Class: ClassType, Parent: ClassType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__extends")(Class.asInstanceOf[js.Any], Parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def prepareNamespace(name: String, depList: String*): js.Function1[/* target */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareNamespace")(List(name.asInstanceOf[js.Any]).`++`(depList.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function1[/* target */ Any, Unit]]
  
  inline def publishNamespace(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("publishNamespace")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setEvil(otherEval: js.Function1[/* code */ String, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEvil")(otherEval.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait ClassType
    extends StObject
       with /* key */ StringDictionary[Any]
       with Instantiable1[/* args (repeated) */ Any, ClassType]
}
