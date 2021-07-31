package typings.filesystem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flags extends StObject {
  
  /**
    * Used to indicate that the user wants to create a file or directory if it was not previously there.
    */
  var create: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By itself, exclusive must have no effect. Used with create, it must cause getFile and getDirectory to fail if the target path already exists.
    */
  var exclusive: js.UndefOr[Boolean] = js.undefined
}
object Flags {
  
  @scala.inline
  def apply(): Flags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flags]
  }
  
  @scala.inline
  implicit class FlagsMutableBuilder[Self <: Flags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
  }
}
