package typings.etag

import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("etag", JSImport.Namespace)
  @js.native
  def apply(entity: String): String = js.native
  @JSImport("etag", JSImport.Namespace)
  @js.native
  def apply(entity: String, options: Options): String = js.native
  @JSImport("etag", JSImport.Namespace)
  @js.native
  def apply(entity: StatsLike): String = js.native
  @JSImport("etag", JSImport.Namespace)
  @js.native
  def apply(entity: StatsLike, options: Options): String = js.native
  @JSImport("etag", JSImport.Namespace)
  @js.native
  def apply(entity: Buffer): String = js.native
  @JSImport("etag", JSImport.Namespace)
  @js.native
  def apply(entity: Buffer, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    var weak: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWeak(value: Boolean): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeakUndefined: Self = StObject.set(x, "weak", js.undefined)
    }
  }
  
  @js.native
  trait StatsLike extends StObject {
    
    var ctime: Date = js.native
    
    var ino: Double = js.native
    
    var mtime: Date = js.native
    
    var size: Double = js.native
  }
  object StatsLike {
    
    @scala.inline
    def apply(ctime: Date, ino: Double, mtime: Date, size: Double): StatsLike = {
      val __obj = js.Dynamic.literal(ctime = ctime.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatsLike]
    }
    
    @scala.inline
    implicit class StatsLikeMutableBuilder[Self <: StatsLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCtime(value: Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIno(value: Double): Self = StObject.set(x, "ino", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtime(value: Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
