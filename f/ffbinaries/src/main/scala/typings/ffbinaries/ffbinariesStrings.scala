package typings.ffbinaries

import typings.ffbinaries.mod.Component
import typings.ffbinaries.mod.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ffbinariesStrings {
  
  @js.native
  sealed trait DONE_CLEAN extends StObject
  inline def DONE_CLEAN: DONE_CLEAN = "DONE_CLEAN".asInstanceOf[DONE_CLEAN]
  
  @js.native
  sealed trait DONE_FROM_CACHE extends StObject
  inline def DONE_FROM_CACHE: DONE_FROM_CACHE = "DONE_FROM_CACHE".asInstanceOf[DONE_FROM_CACHE]
  
  @js.native
  sealed trait FILE_EXISTS extends StObject
  inline def FILE_EXISTS: FILE_EXISTS = "FILE_EXISTS".asInstanceOf[FILE_EXISTS]
  
  @js.native
  sealed trait ffmpeg
    extends StObject
       with Component
  inline def ffmpeg: ffmpeg = "ffmpeg".asInstanceOf[ffmpeg]
  
  @js.native
  sealed trait ffplay
    extends StObject
       with Component
  inline def ffplay: ffplay = "ffplay".asInstanceOf[ffplay]
  
  @js.native
  sealed trait ffprobe
    extends StObject
       with Component
  inline def ffprobe: ffprobe = "ffprobe".asInstanceOf[ffprobe]
  
  @js.native
  sealed trait ffserver
    extends StObject
       with Component
  inline def ffserver: ffserver = "ffserver".asInstanceOf[ffserver]
  
  @js.native
  sealed trait `linux-32`
    extends StObject
       with Platform
  inline def `linux-32`: `linux-32` = "linux-32".asInstanceOf[`linux-32`]
  
  @js.native
  sealed trait `linux-64`
    extends StObject
       with Platform
  inline def `linux-64`: `linux-64` = "linux-64".asInstanceOf[`linux-64`]
  
  @js.native
  sealed trait `linux-armel`
    extends StObject
       with Platform
  inline def `linux-armel`: `linux-armel` = "linux-armel".asInstanceOf[`linux-armel`]
  
  @js.native
  sealed trait `linux-armhf`
    extends StObject
       with Platform
  inline def `linux-armhf`: `linux-armhf` = "linux-armhf".asInstanceOf[`linux-armhf`]
  
  @js.native
  sealed trait locateBinariesSync extends StObject
  inline def locateBinariesSync: locateBinariesSync = "locateBinariesSync".asInstanceOf[locateBinariesSync]
  
  @js.native
  sealed trait `osx-64`
    extends StObject
       with Platform
  inline def `osx-64`: `osx-64` = "osx-64".asInstanceOf[`osx-64`]
  
  @js.native
  sealed trait `windows-32`
    extends StObject
       with Platform
  inline def `windows-32`: `windows-32` = "windows-32".asInstanceOf[`windows-32`]
  
  @js.native
  sealed trait `windows-64`
    extends StObject
       with Platform
  inline def `windows-64`: `windows-64` = "windows-64".asInstanceOf[`windows-64`]
}
