package typings.findUp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("find-up", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findUp(matcher: js.Function1[/* directory */ String, Match | js.Promise[Match]]): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findUp")(matcher.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def findUp(matcher: js.Function1[/* directory */ String, Match | js.Promise[Match]], options: Options): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findUp")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def findUp(name: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findUp")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def findUp(name: String, options: Options): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findUp")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def findUp(name: js.Array[String]): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findUp")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def findUp(name: js.Array[String], options: Options): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findUp")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def findUpMultiple(matcher: js.Function1[/* directory */ String, Match | js.Promise[Match]]): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findUpMultiple")(matcher.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def findUpMultiple(matcher: js.Function1[/* directory */ String, Match | js.Promise[Match]], options: Options): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findUpMultiple")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def findUpMultiple(name: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findUpMultiple")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def findUpMultiple(name: String, options: Options): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findUpMultiple")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def findUpMultiple(name: js.Array[String]): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findUpMultiple")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def findUpMultiple(name: js.Array[String], options: Options): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findUpMultiple")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def findUpMultipleSync(matcher: js.Function1[/* directory */ String, Match]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findUpMultipleSync")(matcher.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def findUpMultipleSync(matcher: js.Function1[/* directory */ String, Match], options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findUpMultipleSync")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def findUpMultipleSync(name: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findUpMultipleSync")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def findUpMultipleSync(name: String, options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findUpMultipleSync")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def findUpMultipleSync(name: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findUpMultipleSync")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def findUpMultipleSync(name: js.Array[String], options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findUpMultipleSync")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("find-up", "findUpStop")
  @js.native
  val findUpStop: js.Symbol = js.native
  
  inline def findUpSync(matcher: js.Function1[/* directory */ String, Match]): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findUpSync")(matcher.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def findUpSync(matcher: js.Function1[/* directory */ String, Match], options: Options): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findUpSync")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def findUpSync(name: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findUpSync")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def findUpSync(name: String, options: Options): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findUpSync")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def findUpSync(name: js.Array[String]): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findUpSync")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def findUpSync(name: js.Array[String], options: Options): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findUpSync")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def pathExists(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathExists")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def pathExistsSync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("pathExistsSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type Match = js.UndefOr[String | js.Symbol]
  
  trait Options
    extends StObject
       with typings.locatePath.mod.Options {
    
    /**
    	The path to the directory to stop the search before reaching root if there were no matches before the `stopAt` directory.
    	@default path.parse(cwd).root
    	*/
    val stopAt: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setStopAt(value: String): Self = StObject.set(x, "stopAt", value.asInstanceOf[js.Any])
      
      inline def setStopAtUndefined: Self = StObject.set(x, "stopAt", js.undefined)
    }
  }
}
