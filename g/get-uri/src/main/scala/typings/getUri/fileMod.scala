package typings.getUri

import typings.getUri.anon.Cache
import typings.getUri.mod.GetUriOptions
import typings.node.fsMod.Stats
import typings.node.streamMod.Readable
import typings.node.urlMod.UrlWithStringQuery
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileMod {
  
  @JSImport("get-uri/dist/file", JSImport.Default)
  @js.native
  def default(hasHref: UrlWithStringQuery, opts: FileOptions): js.Promise[Readable] = js.native
  
  type FileOptions = GetUriOptions with ReadStreamOptions with Cache
  
  @js.native
  trait FileReadable extends Readable {
    
    var stat: js.UndefOr[Stats] = js.native
  }
  
  type ReadStreamOptions = Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<get-uri.anon.FnCall>[1] */ js.Any, 
    String
  ]
}
