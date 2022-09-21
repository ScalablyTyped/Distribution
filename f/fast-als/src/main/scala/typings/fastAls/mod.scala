package typings.fastAls

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-als", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(key: String): js.UndefOr[ReturnValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ReturnValue]]
  inline def get[Payload /* <: Context */, Key /* <: /* keyof Payload */ String */](key: Key): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: Payload[Key] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: Payload[Key] */ js.Any
  ]]
  
  inline def get_Payload_Context[Payload /* <: Context */](key: /* keyof Payload */ String): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: Payload[/ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof key * / any] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: Payload[/ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof key * / any] */ js.Any
  ]]
  
  inline def runWith(defaults: Context, callback: CallbackFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runWith")(defaults.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set(key: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def set[Payload /* <: Context */](
    key: /* keyof Payload */ String,
    value: /* import warning: importer.ImportType#apply Failed type conversion: Payload[/ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof key * / any] */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def set[Payload /* <: Context */, Key /* <: /* keyof Payload */ String */](
    key: Key,
    value: /* import warning: importer.ImportType#apply Failed type conversion: Payload[Key] */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type CallbackFunction = js.Function0[Unit | js.Thenable[Unit]]
  
  type Context = StringDictionary[Any]
  
  type ReturnValue = String | Double | Boolean | js.Symbol | js.Object
}
