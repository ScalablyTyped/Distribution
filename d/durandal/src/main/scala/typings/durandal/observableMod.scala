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
object observableMod {
  
  inline def apply(obj: js.Any, property: String): js.Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("plugins/observable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertObject(obj: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("convertObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def convertProperty(obj: js.Any, propertyName: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convertProperty")(obj.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def convertProperty(obj: js.Any, propertyName: String, original: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convertProperty")(obj.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], original.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def defineProperty[T](obj: js.Any, propertyName: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(obj.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def defineProperty[T](
    obj: js.Any,
    propertyName: String,
    evaluatorOrOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputedDefine<T> */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(obj.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], evaluatorOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def install(config: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
