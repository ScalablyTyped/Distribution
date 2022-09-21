package typings.dookie

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dookie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pull(uri: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pull")(uri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def pullToStream(uri: String, stream: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pullToStream")(uri.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def push(uri: String, data: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(uri.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def push(uri: String, data: Any, opts: PushOpts): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(uri.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  trait PushOpts extends StObject {
    
    var dropDatabase: Boolean
    
    var filename: js.UndefOr[String] = js.undefined
  }
  object PushOpts {
    
    inline def apply(dropDatabase: Boolean): PushOpts = {
      val __obj = js.Dynamic.literal(dropDatabase = dropDatabase.asInstanceOf[js.Any])
      __obj.asInstanceOf[PushOpts]
    }
    
    extension [Self <: PushOpts](x: Self) {
      
      inline def setDropDatabase(value: Boolean): Self = StObject.set(x, "dropDatabase", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
}
