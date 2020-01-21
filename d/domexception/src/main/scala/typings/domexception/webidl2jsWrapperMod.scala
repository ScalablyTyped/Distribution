package typings.domexception

import typings.domexception.domexceptionImplMod.implementation
import typings.std.DOMException
import typings.webidlConversions.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domexception/webidl2js-wrapper", JSImport.Namespace)
@js.native
object webidl2jsWrapperMod extends js.Object {
  def convert(obj: js.Any): implementation = js.native
  def convert(obj: js.Any, options: Options): implementation = js.native
  def create(globalObject: js.Object): DOMException = js.native
  def create(globalObject: js.Object, hasMessageName: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): DOMException = js.native
  def create(
    globalObject: js.Object,
    hasMessageName: js.Tuple2[js.UndefOr[String], js.UndefOr[String]],
    privateData: js.Object
  ): DOMException = js.native
  def createImpl(globalObject: js.Object): implementation = js.native
  def createImpl(globalObject: js.Object, hasMessageName: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): implementation = js.native
  def createImpl(
    globalObject: js.Object,
    hasMessageName: js.Tuple2[js.UndefOr[String], js.UndefOr[String]],
    privateData: js.Object
  ): implementation = js.native
  def install(globalObject: js.Object): Unit = js.native
  def is(obj: js.Any): /* is std.DOMException */ Boolean = js.native
  def isImpl(obj: js.Any): /* is domexception.domexception/lib/DOMException-impl.implementation */ Boolean = js.native
  def setup[T /* <: DOMException */](obj: T, globalObject: js.Object): T = js.native
  def setup[T /* <: DOMException */](obj: T, globalObject: js.Object, hasMessageName: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): T = js.native
  def setup[T /* <: DOMException */](
    obj: T,
    globalObject: js.Object,
    hasMessageName: js.Tuple2[js.UndefOr[String], js.UndefOr[String]],
    privateData: js.Object
  ): T = js.native
}

