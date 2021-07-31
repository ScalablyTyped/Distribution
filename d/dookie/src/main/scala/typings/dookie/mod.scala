package typings.dookie

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dookie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def pull(uri: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pull")(uri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def pullToStream(uri: String, stream: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pullToStream")(uri.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def push(uri: String, data: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(uri.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def push(uri: String, data: js.Any, opts: PushOpts): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(uri.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  trait PushOpts extends StObject {
    
    var dropDatabase: Boolean
    
    var filename: js.UndefOr[String] = js.undefined
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
