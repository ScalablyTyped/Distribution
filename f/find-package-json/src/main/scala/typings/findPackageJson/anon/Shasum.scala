package typings.findPackageJson.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shasum
  extends StObject
     with /* k */ StringDictionary[js.UndefOr[Any]] {
  
  var shasum: js.UndefOr[String] = js.undefined
  
  var tarball: js.UndefOr[String] = js.undefined
}
object Shasum {
  
  inline def apply(): Shasum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shasum]
  }
  
  extension [Self <: Shasum](x: Self) {
    
    inline def setShasum(value: String): Self = StObject.set(x, "shasum", value.asInstanceOf[js.Any])
    
    inline def setShasumUndefined: Self = StObject.set(x, "shasum", js.undefined)
    
    inline def setTarball(value: String): Self = StObject.set(x, "tarball", value.asInstanceOf[js.Any])
    
    inline def setTarballUndefined: Self = StObject.set(x, "tarball", js.undefined)
  }
}
