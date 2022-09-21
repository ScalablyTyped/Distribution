package typings.flatCache

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("flat-cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearAll(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAll")().asInstanceOf[Boolean]
  inline def clearAll(cacheDir: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAll")(cacheDir.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def clearCacheById(cacheId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCacheById")(cacheId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def clearCacheById(cacheId: String, cacheDir: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clearCacheById")(cacheId.asInstanceOf[js.Any], cacheDir.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def create(cacheId: String): Cache = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(cacheId.asInstanceOf[js.Any]).asInstanceOf[Cache]
  inline def create(cacheId: String, cacheDir: String): Cache = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(cacheId.asInstanceOf[js.Any], cacheDir.asInstanceOf[js.Any])).asInstanceOf[Cache]
  
  inline def createFromFile(filePath: String): Cache = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[Cache]
  
  inline def load(cacheId: String): Cache = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(cacheId.asInstanceOf[js.Any]).asInstanceOf[Cache]
  inline def load(cacheId: String, cacheDir: String): Cache = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(cacheId.asInstanceOf[js.Any], cacheDir.asInstanceOf[js.Any])).asInstanceOf[Cache]
  
  @js.native
  trait Cache extends StObject {
    
    def all(): StringDictionary[Any] = js.native
    
    def destroy(): Unit = js.native
    
    def getKey(key: String): Any = js.native
    
    def keys(): js.Array[String] = js.native
    
    def load(cacheId: String): Unit = js.native
    def load(cacheId: String, cacheDir: String): Unit = js.native
    
    def loadFile(pathToFile: String): Unit = js.native
    
    def removeCacheFile(): Boolean = js.native
    
    def removeKey(key: String): Unit = js.native
    
    def save(): Unit = js.native
    def save(noPrune: Boolean): Unit = js.native
    
    def setKey(key: String, value: Any): Unit = js.native
  }
}
