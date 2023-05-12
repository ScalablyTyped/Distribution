package typings.ffprobe.mod

import typings.ffprobe.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(filePath: String, options: Options): js.Promise[FFProbeResult] = (^.asInstanceOf[js.Dynamic].apply(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FFProbeResult]]
inline def apply(
  filePath: String,
  options: Options,
  cb: js.Function2[/* err */ js.Error, /* info */ FFProbeResult, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].apply(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]

/* Rewritten from type alias, can be one of: 
  - typings.ffprobe.mod.PrimariesMasteringDisplayMetadataSideData
  - typings.ffprobe.mod.LuminanceMasteringDisplayMetadataSideData
  - typings.ffprobe.mod.PrimariesMasteringDisplayMetadataSideData & typings.ffprobe.mod.LuminanceMasteringDisplayMetadataSideData
*/
type MasteringDisplayMetadataSideData = _MasteringDisplayMetadataSideData | (PrimariesMasteringDisplayMetadataSideData & LuminanceMasteringDisplayMetadataSideData)

/* Rewritten from type alias, can be one of: 
  - typings.ffprobe.mod.UnknownSideData
  - typings.ffprobe.mod.DisplayMatrixSideData
  - typings.ffprobe.mod.Stereo3dSideData
  - typings.ffprobe.mod.SphericalMappingSideData
  - typings.ffprobe.mod.SkipSamplesSideData
  - typings.ffprobe.mod.MasteringDisplayMetadataSideData
  - typings.ffprobe.mod.ContentLightLevelMetadataSideData
  - typings.ffprobe.mod.DoviConfigurationRecordSideData
  - typings.ffprobe.mod.AudioServiceTypeSideData
  - typings.ffprobe.mod.MpegtsStreamIdSideData
  - typings.ffprobe.mod.CpbPropertiesSideData
  - typings.ffprobe.mod.WebvttSideData
  - typings.ffprobe.mod.ActiveFormatDescriptionSideData
*/
type SideData = _SideData | (PrimariesMasteringDisplayMetadataSideData & LuminanceMasteringDisplayMetadataSideData)
