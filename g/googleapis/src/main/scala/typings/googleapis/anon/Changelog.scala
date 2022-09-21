package typings.googleapis.anon

import typings.googleapis.synthMod.Semverity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Changelog extends StObject {
  
  var changelog: String
  
  var semverity: Semverity
}
object Changelog {
  
  inline def apply(changelog: String, semverity: Semverity): Changelog = {
    val __obj = js.Dynamic.literal(changelog = changelog.asInstanceOf[js.Any], semverity = semverity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Changelog]
  }
  
  extension [Self <: Changelog](x: Self) {
    
    inline def setChangelog(value: String): Self = StObject.set(x, "changelog", value.asInstanceOf[js.Any])
    
    inline def setSemverity(value: Semverity): Self = StObject.set(x, "semverity", value.asInstanceOf[js.Any])
  }
}
