package typings.findPackageJson.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bin
  extends StObject
     with /* k */ StringDictionary[js.UndefOr[Any]] {
  
  /**
    * If you specify a 'bin' directory, then all the files in that folder will be used as the 'bin' hash.
    */
  var bin: js.UndefOr[String] = js.undefined
  
  /**
    * Put markdown files in here. Eventually, these will be displayed nicely, maybe, someday.
    */
  var doc: js.UndefOr[String] = js.undefined
  
  /**
    * Put example scripts in here. Someday, it might be exposed in some clever way.
    */
  var example: js.UndefOr[String] = js.undefined
  
  /**
    * Tell people where the bulk of your library is. Nothing special is done with the lib folder in any way, but it's useful meta info.
    */
  var lib: js.UndefOr[String] = js.undefined
  
  /**
    * A folder that is full of man pages. Sugar to generate a 'man' array by walking the folder.
    */
  var man: js.UndefOr[String] = js.undefined
  
  var test: js.UndefOr[String] = js.undefined
}
object Bin {
  
  inline def apply(): Bin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bin] (val x: Self) extends AnyVal {
    
    inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
    
    inline def setDoc(value: String): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
    
    inline def setExample(value: String): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
    
    inline def setLib(value: String): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
    
    inline def setLibUndefined: Self = StObject.set(x, "lib", js.undefined)
    
    inline def setMan(value: String): Self = StObject.set(x, "man", value.asInstanceOf[js.Any])
    
    inline def setManUndefined: Self = StObject.set(x, "man", js.undefined)
    
    inline def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
