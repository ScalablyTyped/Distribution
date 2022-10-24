package typings.domexception

import typings.domexception.libDomexceptionImplMod.implementation
import typings.domexception.mod.DOMException
import typings.webidlConversions.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webidl2jsWrapperMod {
  
  @JSImport("domexception/webidl2js-wrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert(obj: Any): implementation = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(obj.asInstanceOf[js.Any]).asInstanceOf[implementation]
  inline def convert(obj: Any, options: Options): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[implementation]
  
  inline def create(globalObject: js.Object): DOMException = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any]).asInstanceOf[DOMException]
  inline def create(globalObject: js.Object, param1: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): DOMException = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[DOMException]
  inline def create(
    globalObject: js.Object,
    param1: js.Tuple2[js.UndefOr[String], js.UndefOr[String]],
    privateData: js.Object
  ): DOMException = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[DOMException]
  inline def create(globalObject: js.Object, param1: Unit, privateData: js.Object): DOMException = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[DOMException]
  
  inline def createImpl(globalObject: js.Object): implementation = ^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any]).asInstanceOf[implementation]
  inline def createImpl(globalObject: js.Object, param1: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[implementation]
  inline def createImpl(
    globalObject: js.Object,
    param1: js.Tuple2[js.UndefOr[String], js.UndefOr[String]],
    privateData: js.Object
  ): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[implementation]
  inline def createImpl(globalObject: js.Object, param1: Unit, privateData: js.Object): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[implementation]
  
  inline def install(globalObject: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(globalObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def is(obj: Any): /* is domexception.domexception.DOMException */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is domexception.domexception.DOMException */ Boolean]
  
  inline def isImpl(obj: Any): /* is domexception.domexception/lib/DOMException-impl.implementation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImpl")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is domexception.domexception/lib/DOMException-impl.implementation */ Boolean]
  
  inline def setup[T /* <: DOMException */](obj: T, globalObject: js.Object): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def setup[T /* <: DOMException */](obj: T, globalObject: js.Object, param2: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def setup[T /* <: DOMException */](
    obj: T,
    globalObject: js.Object,
    param2: js.Tuple2[js.UndefOr[String], js.UndefOr[String]],
    privateData: js.Object
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def setup[T /* <: DOMException */](obj: T, globalObject: js.Object, param2: Unit, privateData: js.Object): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[T]
}
