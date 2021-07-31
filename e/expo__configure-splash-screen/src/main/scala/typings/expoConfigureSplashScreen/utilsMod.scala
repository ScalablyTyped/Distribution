package typings.expoConfigureSplashScreen

import typings.colorString.mod.Color
import typings.expoConfigureSplashScreen.typesMod.DeepRequired
import typings.expoConfigureSplashScreen.typesMod.NonPrimitiveAndNonArrayKeys
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@expo/configure-splash-screen/build/validators/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ensurePropertyExists[T /* <: js.Object */, TK1 /* <: NonPrimitiveAndNonArrayKeys[DeepRequired[T]] */, TK2 /* <: NonPrimitiveAndNonArrayKeys[
    /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<T>[TK1] */ js.Any
  ] */, TK3 /* <: NonPrimitiveAndNonArrayKeys[
    /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<T>[TK1][TK2] */ js.Any
  ] */](`object`: T, propertyPath: js.Array[TK1]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensurePropertyExists")(`object`.asInstanceOf[js.Any], propertyPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def ensurePropertyExists[T /* <: js.Object */, TK1 /* <: NonPrimitiveAndNonArrayKeys[DeepRequired[T]] */, TK2 /* <: NonPrimitiveAndNonArrayKeys[
    /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<T>[TK1] */ js.Any
  ] */, TK3 /* <: NonPrimitiveAndNonArrayKeys[
    /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<T>[TK1][TK2] */ js.Any
  ] */](`object`: T, propertyPath: js.Tuple2[TK1, TK2]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensurePropertyExists")(`object`.asInstanceOf[js.Any], propertyPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def ensurePropertyExists[T /* <: js.Object */, TK1 /* <: NonPrimitiveAndNonArrayKeys[DeepRequired[T]] */, TK2 /* <: NonPrimitiveAndNonArrayKeys[
    /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<T>[TK1] */ js.Any
  ] */, TK3 /* <: NonPrimitiveAndNonArrayKeys[
    /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<T>[TK1][TK2] */ js.Any
  ] */](`object`: T, propertyPath: js.Tuple3[TK1, TK2, TK3]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensurePropertyExists")(`object`.asInstanceOf[js.Any], propertyPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def generateValidateEnumValue[T /* <: Record[String, String] */](availableValues: T): js.Function1[
    /* value */ String, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateValidateEnumValue")(availableValues.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* value */ String, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]]
  
  @scala.inline
  def validateColor(value: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("validateColor")(value.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  @scala.inline
  def validateEnumValue[T /* <: Record[String, String] */](value: String, availableValues: T): /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("validateEnumValue")(value.asInstanceOf[js.Any], availableValues.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any]
  
  @scala.inline
  def validateFileExists(filePath: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateFileExists")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def validateFileIsPng(filePath: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateFileIsPng")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
