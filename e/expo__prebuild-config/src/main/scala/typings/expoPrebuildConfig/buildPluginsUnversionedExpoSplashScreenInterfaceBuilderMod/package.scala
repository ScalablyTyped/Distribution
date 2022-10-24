package typings.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod

import typings.expoPrebuildConfig.anon.ImageName
import typings.expoPrebuildConfig.anon.ImageNameString
import typings.expoPrebuildConfig.anon._empty
import typings.expoPrebuildConfig.anon.`0`
import typings.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod.^
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def applyImageToSplashScreenXML(xml: IBSplashScreenDocument, param1: ImageName): IBSplashScreenDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("applyImageToSplashScreenXML")(xml.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[IBSplashScreenDocument]

inline def createConstraint(param0: js.Tuple2[String, ConstraintAttribute], param1: js.Tuple2[String, ConstraintAttribute]): IBConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("createConstraint")(param0.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[IBConstraint]
inline def createConstraint(
  param0: js.Tuple2[String, ConstraintAttribute],
  param1: js.Tuple2[String, ConstraintAttribute],
  constant: Double
): IBConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("createConstraint")(param0.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], constant.asInstanceOf[js.Any])).asInstanceOf[IBConstraint]

inline def createConstraintId(attributes: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createConstraintId")(attributes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]

inline def ensureUniquePush[TItem /* <: `0` */](array: js.Array[TItem], item: TItem): js.Array[TItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureUniquePush")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[TItem]]

inline def removeExisting[TItem /* <: `0` */](array: js.Array[TItem], item: TItem): js.Array[TItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeExisting")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[TItem]]
inline def removeExisting[TItem /* <: `0` */](array: js.Array[TItem], item: String): js.Array[TItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeExisting")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[TItem]]

inline def removeImageFromSplashScreen(xml: IBSplashScreenDocument, param1: ImageNameString): IBSplashScreenDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("removeImageFromSplashScreen")(xml.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[IBSplashScreenDocument]

inline def toObjectAsync(contents: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObjectAsync")(contents.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]

inline def toString_(xml: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(xml.asInstanceOf[js.Any]).asInstanceOf[String]

/* Rewritten from type alias, can be one of: 
  - typings.expoPrebuildConfig.expoPrebuildConfigStrings.YES
  - typings.expoPrebuildConfig.expoPrebuildConfigStrings.NO
  - scala.Boolean
*/
type IBBoolean = _IBBoolean | Boolean

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.expoPrebuildConfig.expoPrebuildConfigStrings.left
  - typings.expoPrebuildConfig.expoPrebuildConfigStrings.scaleAspectFill
*/
type IBContentMode = _IBContentMode | String

type IBItem[H /* <: Record[String, Any] */, B /* <: Record[String, js.Array[Any]] */] = _empty[H] & B
