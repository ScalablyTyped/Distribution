package typings.ffbinaries

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Arch extends StObject {
    
    var arch: String
    
    var `type`: String
  }
  object Arch {
    
    inline def apply(arch: String, `type`: String): Arch = {
      val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arch]
    }
    
    extension [Self <: Arch](x: Self) {
      
      inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ffmpeg extends StObject {
    
    var ffmpeg: String
    
    var ffplay: js.UndefOr[String] = js.undefined
    
    var ffprobe: String
    
    var ffserver: js.UndefOr[String] = js.undefined
  }
  object Ffmpeg {
    
    inline def apply(ffmpeg: String, ffprobe: String): Ffmpeg = {
      val __obj = js.Dynamic.literal(ffmpeg = ffmpeg.asInstanceOf[js.Any], ffprobe = ffprobe.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ffmpeg]
    }
    
    extension [Self <: Ffmpeg](x: Self) {
      
      inline def setFfmpeg(value: String): Self = StObject.set(x, "ffmpeg", value.asInstanceOf[js.Any])
      
      inline def setFfplay(value: String): Self = StObject.set(x, "ffplay", value.asInstanceOf[js.Any])
      
      inline def setFfplayUndefined: Self = StObject.set(x, "ffplay", js.undefined)
      
      inline def setFfprobe(value: String): Self = StObject.set(x, "ffprobe", value.asInstanceOf[js.Any])
      
      inline def setFfserver(value: String): Self = StObject.set(x, "ffserver", value.asInstanceOf[js.Any])
      
      inline def setFfserverUndefined: Self = StObject.set(x, "ffserver", js.undefined)
    }
  }
  
  trait Filename extends StObject {
    
    var filename: String
    
    var progress: Double
  }
  object Filename {
    
    inline def apply(filename: String, progress: Double): Filename = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filename]
    }
    
    extension [Self <: Filename](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ K in ffbinaries.ffbinaries.Platform ]: {  ffmpeg :string,   ffprobe :string,   ffplay :string | undefined,   ffserver :string | undefined}} */
  trait KinPlatformffmpegstringff extends StObject {
    
    var `linux-32`: Ffmpeg
    
    var `linux-64`: Ffmpeg
    
    var `linux-armel`: Ffmpeg
    
    var `linux-armhf`: Ffmpeg
    
    var `osx-64`: Ffmpeg
    
    var `windows-32`: Ffmpeg
    
    var `windows-64`: Ffmpeg
  }
  object KinPlatformffmpegstringff {
    
    inline def apply(
      `linux-32`: Ffmpeg,
      `linux-64`: Ffmpeg,
      `linux-armel`: Ffmpeg,
      `linux-armhf`: Ffmpeg,
      `osx-64`: Ffmpeg,
      `windows-32`: Ffmpeg,
      `windows-64`: Ffmpeg
    ): KinPlatformffmpegstringff = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("linux-32")(`linux-32`.asInstanceOf[js.Any])
      __obj.updateDynamic("linux-64")(`linux-64`.asInstanceOf[js.Any])
      __obj.updateDynamic("linux-armel")(`linux-armel`.asInstanceOf[js.Any])
      __obj.updateDynamic("linux-armhf")(`linux-armhf`.asInstanceOf[js.Any])
      __obj.updateDynamic("osx-64")(`osx-64`.asInstanceOf[js.Any])
      __obj.updateDynamic("windows-32")(`windows-32`.asInstanceOf[js.Any])
      __obj.updateDynamic("windows-64")(`windows-64`.asInstanceOf[js.Any])
      __obj.asInstanceOf[KinPlatformffmpegstringff]
    }
    
    extension [Self <: KinPlatformffmpegstringff](x: Self) {
      
      inline def `setLinux-32`(value: Ffmpeg): Self = StObject.set(x, "linux-32", value.asInstanceOf[js.Any])
      
      inline def `setLinux-64`(value: Ffmpeg): Self = StObject.set(x, "linux-64", value.asInstanceOf[js.Any])
      
      inline def `setLinux-armel`(value: Ffmpeg): Self = StObject.set(x, "linux-armel", value.asInstanceOf[js.Any])
      
      inline def `setLinux-armhf`(value: Ffmpeg): Self = StObject.set(x, "linux-armhf", value.asInstanceOf[js.Any])
      
      inline def `setOsx-64`(value: Ffmpeg): Self = StObject.set(x, "osx-64", value.asInstanceOf[js.Any])
      
      inline def `setWindows-32`(value: Ffmpeg): Self = StObject.set(x, "windows-32", value.asInstanceOf[js.Any])
      
      inline def `setWindows-64`(value: Ffmpeg): Self = StObject.set(x, "windows-64", value.asInstanceOf[js.Any])
    }
  }
}
