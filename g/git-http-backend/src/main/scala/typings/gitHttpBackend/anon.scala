package typings.gitHttpBackend

import typings.gitHttpBackend.gitHttpBackendStrings.pull
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Gitreceivepack extends StObject {
    
    var `git-receive-pack`: String
    
    var `git-upload-pack`: pull
  }
  object Gitreceivepack {
    
    inline def apply(`git-receive-pack`: String): Gitreceivepack = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("git-receive-pack")(`git-receive-pack`.asInstanceOf[js.Any])
      __obj.updateDynamic("git-upload-pack")("pull")
      __obj.asInstanceOf[Gitreceivepack]
    }
    
    extension [Self <: Gitreceivepack](x: Self) {
      
      inline def `setGit-receive-pack`(value: String): Self = StObject.set(x, "git-receive-pack", value.asInstanceOf[js.Any])
      
      inline def `setGit-upload-pack`(value: pull): Self = StObject.set(x, "git-upload-pack", value.asInstanceOf[js.Any])
    }
  }
}
