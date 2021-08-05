package typings.domexception

import typings.domexception.domexceptionImplMod.implementation
import typings.std.DOMException
import typings.webidlConversions.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webidl2jsWrapperMod {
  
  @JSImport("domexception/webidl2js-wrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert(obj: js.Any): implementation = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(obj.asInstanceOf[js.Any]).asInstanceOf[implementation]
  inline def convert(obj: js.Any, options: Options): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[implementation]
  
  inline def create(globalObject: js.Object): DOMException = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any]).asInstanceOf[DOMException]
  inline def create(globalObject: js.Object, hasMessageName: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): DOMException = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], hasMessageName.asInstanceOf[js.Any])).asInstanceOf[DOMException]
  inline def create(
    globalObject: js.Object,
    hasMessageName: js.Tuple2[js.UndefOr[String], js.UndefOr[String]],
    privateData: js.Object
  ): DOMException = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], hasMessageName.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[DOMException]
  inline def create(globalObject: js.Object, hasMessageName: Unit, privateData: js.Object): DOMException = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], hasMessageName.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[DOMException]
  
  inline def createImpl(globalObject: js.Object): implementation = ^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any]).asInstanceOf[implementation]
  inline def createImpl(globalObject: js.Object, hasMessageName: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any], hasMessageName.asInstanceOf[js.Any])).asInstanceOf[implementation]
  inline def createImpl(
    globalObject: js.Object,
    hasMessageName: js.Tuple2[js.UndefOr[String], js.UndefOr[String]],
    privateData: js.Object
  ): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any], hasMessageName.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[implementation]
  inline def createImpl(globalObject: js.Object, hasMessageName: Unit, privateData: js.Object): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any], hasMessageName.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[implementation]
  
  inline def install(globalObject: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(globalObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def is(obj: js.Any): /* is std.DOMException */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.DOMException */ Boolean]
  
  inline def isImpl(obj: js.Any): /* is domexception.domexception/lib/DOMException-impl.implementation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImpl")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is domexception.domexception/lib/DOMException-impl.implementation */ Boolean]
  
  inline def setup[T /* <: DOMException */](obj: T, globalObject: js.Object): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def setup[T /* <: DOMException */](obj: T, globalObject: js.Object, hasMessageName: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], hasMessageName.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def setup[T /* <: DOMException */](
    obj: T,
    globalObject: js.Object,
    hasMessageName: js.Tuple2[js.UndefOr[String], js.UndefOr[String]],
    privateData: js.Object
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], hasMessageName.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def setup[T /* <: DOMException */](obj: T, globalObject: js.Object, hasMessageName: Unit, privateData: js.Object): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], hasMessageName.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[T]
}
