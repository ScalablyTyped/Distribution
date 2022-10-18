package typings.durandal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables automatic observability of plain javascript object for ES5 compatible browsers. Also, converts promise properties into observables that are updated when the promise resolves.
  * @requires system
  * @requires binder
  * @requires knockout
  */
object pluginsObservableMod {
  
  inline def apply(obj: Any, property: String): Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("plugins/observable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertObject(obj: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("convertObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def convertProperty(obj: Any, propertyName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convertProperty")(obj.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def convertProperty(obj: Any, propertyName: String, original: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convertProperty")(obj.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], original.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def defineProperty[T](obj: Any, propertyName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(obj.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def defineProperty[T](
    obj: Any,
    propertyName: String,
    evaluatorOrOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputedDefine<T> */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(obj.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], evaluatorOrOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def install(config: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
