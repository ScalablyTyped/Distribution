package typings.flatCache

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("flat-cache", "clearAll")
  @js.native
  def clearAll(): Boolean = js.native
  @JSImport("flat-cache", "clearAll")
  @js.native
  def clearAll(cacheDir: String): Boolean = js.native
  
  @JSImport("flat-cache", "clearCacheById")
  @js.native
  def clearCacheById(cacheId: String): Boolean = js.native
  @JSImport("flat-cache", "clearCacheById")
  @js.native
  def clearCacheById(cacheId: String, cacheDir: String): Boolean = js.native
  
  @JSImport("flat-cache", "create")
  @js.native
  def create(cacheId: String): Cache = js.native
  @JSImport("flat-cache", "create")
  @js.native
  def create(cacheId: String, cacheDir: String): Cache = js.native
  
  @JSImport("flat-cache", "createFromFile")
  @js.native
  def createFromFile(filePath: String): Cache = js.native
  
  @JSImport("flat-cache", "load")
  @js.native
  def load(cacheId: String): Cache = js.native
  @JSImport("flat-cache", "load")
  @js.native
  def load(cacheId: String, cacheDir: String): Cache = js.native
  
  @js.native
  trait Cache extends StObject {
    
    def all(): StringDictionary[js.Any] = js.native
    
    def destroy(): Unit = js.native
    
    def getKey(key: String): js.Any = js.native
    
    def keys(): js.Array[String] = js.native
    
    def load(cacheId: String): Unit = js.native
    def load(cacheId: String, cacheDir: String): Unit = js.native
    
    def loadFile(pathToFile: String): Unit = js.native
    
    def removeCacheFile(): Boolean = js.native
    
    def removeKey(key: String): Unit = js.native
    
    def save(): Unit = js.native
    def save(noPrune: Boolean): Unit = js.native
    
    def setKey(key: String, value: js.Any): Unit = js.native
  }
}
