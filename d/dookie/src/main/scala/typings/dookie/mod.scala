package typings.dookie

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dookie", "pull")
  @js.native
  def pull(uri: String): js.Promise[_] = js.native
  
  @JSImport("dookie", "pullToStream")
  @js.native
  def pullToStream(uri: String, stream: js.Any): js.Promise[_] = js.native
  
  @JSImport("dookie", "push")
  @js.native
  def push(uri: String, data: js.Any): js.Promise[_] = js.native
  @JSImport("dookie", "push")
  @js.native
  def push(uri: String, data: js.Any, opts: PushOpts): js.Promise[_] = js.native
  
  @js.native
  trait PushOpts extends StObject {
    
    var dropDatabase: Boolean = js.native
    
    var filename: js.UndefOr[String] = js.native
  }
  object PushOpts {
    
    @scala.inline
    def apply(dropDatabase: Boolean): PushOpts = {
      val __obj = js.Dynamic.literal(dropDatabase = dropDatabase.asInstanceOf[js.Any])
      __obj.asInstanceOf[PushOpts]
    }
    
    @scala.inline
    implicit class PushOptsMutableBuilder[Self <: PushOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDropDatabase(value: Boolean): Self = StObject.set(x, "dropDatabase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
}
