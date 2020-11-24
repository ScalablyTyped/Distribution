package typings.expoConfigureSplashScreen

import typings.colorString.mod.Color
import typings.expoConfigureSplashScreen.typesMod.DeepRequired
import typings.expoConfigureSplashScreen.typesMod.NonPrimitiveAndNonArrayKeys
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@expo/configure-splash-screen/build/validators/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def ensurePropertyExists[T /* <: js.Object */, TK1 /* <: NonPrimitiveAndNonArrayKeys[DeepRequired[T]] */, TK2 /* <: NonPrimitiveAndNonArrayKeys[
    /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<T>[TK1] */ js.Any
  ] */, TK3 /* <: NonPrimitiveAndNonArrayKeys[
    /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<T>[TK1][TK2] */ js.Any
  ] */](`object`: T, propertyPath: js.Array[TK1]): Unit = js.native
  def ensurePropertyExists[T /* <: js.Object */, TK1 /* <: NonPrimitiveAndNonArrayKeys[DeepRequired[T]] */, TK2 /* <: NonPrimitiveAndNonArrayKeys[
    /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<T>[TK1] */ js.Any
  ] */, TK3 /* <: NonPrimitiveAndNonArrayKeys[
    /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<T>[TK1][TK2] */ js.Any
  ] */](`object`: T, propertyPath: js.Tuple2[TK1, TK2]): Unit = js.native
  def ensurePropertyExists[T /* <: js.Object */, TK1 /* <: NonPrimitiveAndNonArrayKeys[DeepRequired[T]] */, TK2 /* <: NonPrimitiveAndNonArrayKeys[
    /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<T>[TK1] */ js.Any
  ] */, TK3 /* <: NonPrimitiveAndNonArrayKeys[
    /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<T>[TK1][TK2] */ js.Any
  ] */](`object`: T, propertyPath: js.Tuple3[TK1, TK2, TK3]): Unit = js.native
  
  def generateValidateEnumValue[T /* <: Record[String, String] */](availableValues: T): js.Function1[
    /* value */ String, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  def validateColor(value: String): Color = js.native
  
  def validateEnumValue[T /* <: Record[String, String] */](value: String, availableValues: T): /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any = js.native
  
  def validateFileExists(filePath: String): js.Promise[String] = js.native
  
  def validateFileIsPng(filePath: String): js.Promise[String] = js.native
}
