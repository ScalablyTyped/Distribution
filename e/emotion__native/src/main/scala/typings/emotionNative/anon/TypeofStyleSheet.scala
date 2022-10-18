package typings.emotionNative.anon

import typings.reactNative.mod.RegisteredStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.StyleSheet.AbsoluteFillStyle
import typings.reactNative.mod.StyleSheet.NamedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofStyleSheet extends StObject {
  
  val absoluteFill: RegisteredStyle[AbsoluteFillStyle] = js.native
  
  val absoluteFillObject: AbsoluteFillStyle = js.native
  
  def compose[T](style1: js.Array[StyleProp[T]], style2: js.Array[StyleProp[T]]): StyleProp[T] = js.native
  def compose[T](style1: js.Array[StyleProp[T]], style2: StyleProp[T]): StyleProp[T] = js.native
  def compose[T](style1: StyleProp[T], style2: js.Array[StyleProp[T]]): StyleProp[T] = js.native
  def compose[T](style1: StyleProp[T], style2: StyleProp[T]): StyleProp[T] = js.native
  
  def create[T /* <: NamedStyles[Any | T] */](styles: T): T = js.native
  def create[T /* <: NamedStyles[Any | T] */](styles: NamedStyles[T]): T = js.native
  
  def flatten[T](): /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer U> ? U : T */ js.Any = js.native
  def flatten[T](style: StyleProp[T]): /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer U> ? U : T */ js.Any = js.native
  
  val hairlineWidth: Double = js.native
  
  def setStyleAttributePreprocessor(property: String, process: js.Function1[/* nextProp */ Any, Any]): Unit = js.native
}
