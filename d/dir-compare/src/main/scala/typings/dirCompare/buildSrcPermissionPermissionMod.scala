package typings.dirCompare

import typings.dirCompare.buildSrcTypesMod.Entry
import typings.dirCompare.buildSrcTypesMod.PermissionDeniedState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPermissionPermissionMod {
  
  object Permission {
    
    @JSImport("dir-compare/build/src/Permission/Permission", "Permission")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPermissionDeniedState(entry1: Entry, entry2: Entry): PermissionDeniedState = (^.asInstanceOf[js.Dynamic].applyDynamic("getPermissionDeniedState")(entry1.asInstanceOf[js.Any], entry2.asInstanceOf[js.Any])).asInstanceOf[PermissionDeniedState]
    
    inline def getPermissionDeniedStateWhenLeftMissing(entry2: Entry): PermissionDeniedState = ^.asInstanceOf[js.Dynamic].applyDynamic("getPermissionDeniedStateWhenLeftMissing")(entry2.asInstanceOf[js.Any]).asInstanceOf[PermissionDeniedState]
    
    inline def getPermissionDeniedStateWhenRightMissing(entry1: Entry): PermissionDeniedState = ^.asInstanceOf[js.Dynamic].applyDynamic("getPermissionDeniedStateWhenRightMissing")(entry1.asInstanceOf[js.Any]).asInstanceOf[PermissionDeniedState]
  }
}
