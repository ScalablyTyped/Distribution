package typings.etag

import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(entity: String): String = ^.asInstanceOf[js.Dynamic].apply(entity.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(entity: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(entity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(entity: StatsLike): String = ^.asInstanceOf[js.Dynamic].apply(entity.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(entity: StatsLike, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(entity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(entity: Buffer): String = ^.asInstanceOf[js.Dynamic].apply(entity.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(entity: Buffer, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(entity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("etag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var weak: js.UndefOr[Boolean] = js.undefined
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
  
  trait StatsLike extends StObject {
    
    var ctime: Date
    
    var ino: Double
    
    var mtime: Date
    
    var size: Double
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
