package typings.fileSystemCache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonUtilMod {
  
  @JSImport("file-system-cache/lib/common/Util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compact(input: js.Array[Any]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @JSImport("file-system-cache/lib/common/Util", "ensureString")
  @js.native
  val ensureString: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Curry.Curry<(defaultValue : any, text : any): any> */ Any = js.native
  
  inline def filePathsP(basePath: String, ns: String): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filePathsP")(basePath.asInstanceOf[js.Any], ns.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def getValueP(path: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueP")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def getValueP(path: String, defaultValue: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueP")(path.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def hash(values: Any*): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.UndefOr[String]]
  
  inline def isFileSync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNothing(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNothing")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(`val`: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def readFileSync(path: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def toAbsolutePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toAbsolutePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toGetValue(data: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toGetValue")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def toJson(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toJson")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toStringArray(input: js.Array[Any]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toStringArray")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
