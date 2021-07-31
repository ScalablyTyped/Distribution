package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessMemoryInfo extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/process-memory-info
  /**
    * The amount of memory not shared by other processes, such as JS heap or HTML
    * content in Kilobytes.
    */
  var `private`: Double
  
  /**
    * The amount of memory currently pinned to actual physical RAM in Kilobytes.
    *
    * @platform linux,win32
    */
  var residentSet: Double
  
  /**
    * The amount of memory shared between processes, typically memory consumed by the
    * Electron code itself in Kilobytes.
    */
  var shared: Double
}
object ProcessMemoryInfo {
  
  @scala.inline
  def apply(`private`: Double, residentSet: Double, shared: Double): ProcessMemoryInfo = {
    val __obj = js.Dynamic.literal(residentSet = residentSet.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessMemoryInfo]
  }
  
  @scala.inline
  implicit class ProcessMemoryInfoMutableBuilder[Self <: ProcessMemoryInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivate(value: Double): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResidentSet(value: Double): Self = StObject.set(x, "residentSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShared(value: Double): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
  }
}
