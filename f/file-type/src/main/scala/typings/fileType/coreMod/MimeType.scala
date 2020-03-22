package typings.fileType.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fileType.fileTypeStrings.imageSlashjpeg
  - typings.fileType.fileTypeStrings.imageSlashpng
  - typings.fileType.fileTypeStrings.imageSlashgif
  - typings.fileType.fileTypeStrings.imageSlashwebp
  - typings.fileType.fileTypeStrings.imageSlashflif
  - typings.fileType.fileTypeStrings.`imageSlashx-canon-cr2`
  - typings.fileType.fileTypeStrings.`imageSlashx-canon-cr3`
  - typings.fileType.fileTypeStrings.imageSlashtiff
  - typings.fileType.fileTypeStrings.imageSlashbmp
  - typings.fileType.fileTypeStrings.`imageSlashvndDotms-photo`
  - typings.fileType.fileTypeStrings.imageSlashvndDotadobeDotphotoshop
  - typings.fileType.fileTypeStrings.applicationSlashepubPlussignzip
  - typings.fileType.fileTypeStrings.`applicationSlashx-xpinstall`
  - typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDottext
  - typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotspreadsheet
  - typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotpresentation
  - typings.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotwordprocessingmlDotdocument`
  - typings.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotpresentationmlDotpresentation`
  - typings.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotspreadsheetmlDotsheet`
  - typings.fileType.fileTypeStrings.applicationSlashzip
  - typings.fileType.fileTypeStrings.`applicationSlashx-tar`
  - typings.fileType.fileTypeStrings.`applicationSlashx-rar-compressed`
  - typings.fileType.fileTypeStrings.applicationSlashgzip
  - typings.fileType.fileTypeStrings.`applicationSlashx-bzip2`
  - typings.fileType.fileTypeStrings.`applicationSlashx-7z-compressed`
  - typings.fileType.fileTypeStrings.`applicationSlashx-apple-diskimage`
  - typings.fileType.fileTypeStrings.videoSlashmp4
  - typings.fileType.fileTypeStrings.audioSlashmidi
  - typings.fileType.fileTypeStrings.`videoSlashx-matroska`
  - typings.fileType.fileTypeStrings.videoSlashwebm
  - typings.fileType.fileTypeStrings.videoSlashquicktime
  - typings.fileType.fileTypeStrings.videoSlashvndDotavi
  - typings.fileType.fileTypeStrings.audioSlashvndDotwave
  - typings.fileType.fileTypeStrings.audioSlashqcelp
  - typings.fileType.fileTypeStrings.`audioSlashx-ms-wma`
  - typings.fileType.fileTypeStrings.`videoSlashx-ms-asf`
  - typings.fileType.fileTypeStrings.`applicationSlashvndDotms-asf`
  - typings.fileType.fileTypeStrings.videoSlashmpeg
  - typings.fileType.fileTypeStrings.videoSlash3gpp
  - typings.fileType.fileTypeStrings.audioSlashmpeg
  - typings.fileType.fileTypeStrings.audioSlashmp4
  - typings.fileType.fileTypeStrings.audioSlashopus
  - typings.fileType.fileTypeStrings.videoSlashogg
  - typings.fileType.fileTypeStrings.audioSlashogg
  - typings.fileType.fileTypeStrings.applicationSlashogg
  - typings.fileType.fileTypeStrings.`audioSlashx-flac`
  - typings.fileType.fileTypeStrings.audioSlashape
  - typings.fileType.fileTypeStrings.audioSlashwavpack
  - typings.fileType.fileTypeStrings.audioSlashamr
  - typings.fileType.fileTypeStrings.applicationSlashpdf
  - typings.fileType.fileTypeStrings.`applicationSlashx-msdownload`
  - typings.fileType.fileTypeStrings.`applicationSlashx-shockwave-flash`
  - typings.fileType.fileTypeStrings.applicationSlashrtf
  - typings.fileType.fileTypeStrings.applicationSlashwasm
  - typings.fileType.fileTypeStrings.fontSlashwoff
  - typings.fileType.fileTypeStrings.fontSlashwoff2
  - typings.fileType.fileTypeStrings.`applicationSlashvndDotms-fontobject`
  - typings.fileType.fileTypeStrings.fontSlashttf
  - typings.fileType.fileTypeStrings.fontSlashotf
  - typings.fileType.fileTypeStrings.`imageSlashx-icon`
  - typings.fileType.fileTypeStrings.`videoSlashx-flv`
  - typings.fileType.fileTypeStrings.applicationSlashpostscript
  - typings.fileType.fileTypeStrings.`applicationSlashx-xz`
  - typings.fileType.fileTypeStrings.`applicationSlashx-sqlite3`
  - typings.fileType.fileTypeStrings.`applicationSlashx-nintendo-nes-rom`
  - typings.fileType.fileTypeStrings.`applicationSlashx-google-chrome-extension`
  - typings.fileType.fileTypeStrings.`applicationSlashvndDotms-cab-compressed`
  - typings.fileType.fileTypeStrings.`applicationSlashx-deb`
  - typings.fileType.fileTypeStrings.`applicationSlashx-unix-archive`
  - typings.fileType.fileTypeStrings.`applicationSlashx-rpm`
  - typings.fileType.fileTypeStrings.`applicationSlashx-compress`
  - typings.fileType.fileTypeStrings.`applicationSlashx-lzip`
  - typings.fileType.fileTypeStrings.`applicationSlashx-msi`
  - typings.fileType.fileTypeStrings.`applicationSlashx-mie`
  - typings.fileType.fileTypeStrings.`applicationSlashx-apache-arrow`
  - typings.fileType.fileTypeStrings.applicationSlashmxf
  - typings.fileType.fileTypeStrings.videoSlashmp2t
  - typings.fileType.fileTypeStrings.`applicationSlashx-blender`
  - typings.fileType.fileTypeStrings.imageSlashbpg
  - typings.fileType.fileTypeStrings.imageSlashjp2
  - typings.fileType.fileTypeStrings.imageSlashjpx
  - typings.fileType.fileTypeStrings.imageSlashjpm
  - typings.fileType.fileTypeStrings.imageSlashmj2
  - typings.fileType.fileTypeStrings.audioSlashaiff
  - typings.fileType.fileTypeStrings.applicationSlashxml
  - typings.fileType.fileTypeStrings.`applicationSlashx-mobipocket-ebook`
  - typings.fileType.fileTypeStrings.imageSlashheif
  - typings.fileType.fileTypeStrings.`imageSlashheif-sequence`
  - typings.fileType.fileTypeStrings.imageSlashheic
  - typings.fileType.fileTypeStrings.`imageSlashheic-sequence`
  - typings.fileType.fileTypeStrings.imageSlashktx
  - typings.fileType.fileTypeStrings.applicationSlashdicom
  - typings.fileType.fileTypeStrings.`audioSlashx-musepack`
  - typings.fileType.fileTypeStrings.textSlashcalendar
  - typings.fileType.fileTypeStrings.`modelSlashgltf-binary`
  - typings.fileType.fileTypeStrings.applicationSlashvndDottcpdumpDotpcap
  - typings.fileType.fileTypeStrings.`audioSlashx-dsf`
  - typings.fileType.fileTypeStrings.applicationSlashxDotmsDotshortcut
  - typings.fileType.fileTypeStrings.applicationSlashxDotappleDotalias
  - typings.fileType.fileTypeStrings.`audioSlashx-voc`
  - typings.fileType.fileTypeStrings.`audioSlashvndDotdolbyDotdd-raw`
  - typings.fileType.fileTypeStrings.`audioSlashx-m4a`
  - typings.fileType.fileTypeStrings.imageSlashapng
  - typings.fileType.fileTypeStrings.`imageSlashx-olympus-orf`
  - typings.fileType.fileTypeStrings.`imageSlashx-sony-arw`
  - typings.fileType.fileTypeStrings.`imageSlashx-adobe-dng`
  - typings.fileType.fileTypeStrings.`imageSlashx-nikon-nef`
  - typings.fileType.fileTypeStrings.`imageSlashx-panasonic-rw2`
  - typings.fileType.fileTypeStrings.`imageSlashx-fujifilm-raf`
  - typings.fileType.fileTypeStrings.`videoSlashx-m4v`
  - typings.fileType.fileTypeStrings.videoSlash3gpp2
  - typings.fileType.fileTypeStrings.`applicationSlashx-esri-shape`
  - typings.fileType.fileTypeStrings.audioSlashaac
  - typings.fileType.fileTypeStrings.`audioSlashx-it`
  - typings.fileType.fileTypeStrings.`audioSlashx-s3m`
  - typings.fileType.fileTypeStrings.`audioSlashx-xm`
  - typings.fileType.fileTypeStrings.videoSlashMP1S
  - typings.fileType.fileTypeStrings.videoSlashMP2P
*/
trait MimeType extends js.Object

object MimeType {
  @scala.inline
  def applicationSlashdicom: typings.fileType.fileTypeStrings.applicationSlashdicom = this.cast("application/dicom")
  @scala.inline
  def applicationSlashepubPlussignzip: typings.fileType.fileTypeStrings.applicationSlashepubPlussignzip = this.cast("application/epub+zip")
  @scala.inline
  def applicationSlashgzip: typings.fileType.fileTypeStrings.applicationSlashgzip = this.cast("application/gzip")
  @scala.inline
  def applicationSlashmxf: typings.fileType.fileTypeStrings.applicationSlashmxf = this.cast("application/mxf")
  @scala.inline
  def applicationSlashogg: typings.fileType.fileTypeStrings.applicationSlashogg = this.cast("application/ogg")
  @scala.inline
  def applicationSlashpdf: typings.fileType.fileTypeStrings.applicationSlashpdf = this.cast("application/pdf")
  @scala.inline
  def applicationSlashpostscript: typings.fileType.fileTypeStrings.applicationSlashpostscript = this.cast("application/postscript")
  @scala.inline
  def applicationSlashrtf: typings.fileType.fileTypeStrings.applicationSlashrtf = this.cast("application/rtf")
  @scala.inline
  def `applicationSlashvndDotms-asf`: typings.fileType.fileTypeStrings.`applicationSlashvndDotms-asf` = this.cast("application/vnd.ms-asf")
  @scala.inline
  def `applicationSlashvndDotms-cab-compressed`: typings.fileType.fileTypeStrings.`applicationSlashvndDotms-cab-compressed` = this.cast("application/vnd.ms-cab-compressed")
  @scala.inline
  def `applicationSlashvndDotms-fontobject`: typings.fileType.fileTypeStrings.`applicationSlashvndDotms-fontobject` = this.cast("application/vnd.ms-fontobject")
  @scala.inline
  def applicationSlashvndDotoasisDotopendocumentDotpresentation: typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotpresentation = this.cast("application/vnd.oasis.opendocument.presentation")
  @scala.inline
  def applicationSlashvndDotoasisDotopendocumentDotspreadsheet: typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotspreadsheet = this.cast("application/vnd.oasis.opendocument.spreadsheet")
  @scala.inline
  def applicationSlashvndDotoasisDotopendocumentDottext: typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDottext = this.cast("application/vnd.oasis.opendocument.text")
  @scala.inline
  def `applicationSlashvndDotopenxmlformats-officedocumentDotpresentationmlDotpresentation`: typings.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotpresentationmlDotpresentation` = this.cast("application/vnd.openxmlformats-officedocument.presentationml.presentation")
  @scala.inline
  def `applicationSlashvndDotopenxmlformats-officedocumentDotspreadsheetmlDotsheet`: typings.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotspreadsheetmlDotsheet` = this.cast("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")
  @scala.inline
  def `applicationSlashvndDotopenxmlformats-officedocumentDotwordprocessingmlDotdocument`: typings.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotwordprocessingmlDotdocument` = this.cast("application/vnd.openxmlformats-officedocument.wordprocessingml.document")
  @scala.inline
  def applicationSlashvndDottcpdumpDotpcap: typings.fileType.fileTypeStrings.applicationSlashvndDottcpdumpDotpcap = this.cast("application/vnd.tcpdump.pcap")
  @scala.inline
  def applicationSlashwasm: typings.fileType.fileTypeStrings.applicationSlashwasm = this.cast("application/wasm")
  @scala.inline
  def `applicationSlashx-7z-compressed`: typings.fileType.fileTypeStrings.`applicationSlashx-7z-compressed` = this.cast("application/x-7z-compressed")
  @scala.inline
  def `applicationSlashx-apache-arrow`: typings.fileType.fileTypeStrings.`applicationSlashx-apache-arrow` = this.cast("application/x-apache-arrow")
  @scala.inline
  def `applicationSlashx-apple-diskimage`: typings.fileType.fileTypeStrings.`applicationSlashx-apple-diskimage` = this.cast("application/x-apple-diskimage")
  @scala.inline
  def `applicationSlashx-blender`: typings.fileType.fileTypeStrings.`applicationSlashx-blender` = this.cast("application/x-blender")
  @scala.inline
  def `applicationSlashx-bzip2`: typings.fileType.fileTypeStrings.`applicationSlashx-bzip2` = this.cast("application/x-bzip2")
  @scala.inline
  def `applicationSlashx-compress`: typings.fileType.fileTypeStrings.`applicationSlashx-compress` = this.cast("application/x-compress")
  @scala.inline
  def `applicationSlashx-deb`: typings.fileType.fileTypeStrings.`applicationSlashx-deb` = this.cast("application/x-deb")
  @scala.inline
  def `applicationSlashx-esri-shape`: typings.fileType.fileTypeStrings.`applicationSlashx-esri-shape` = this.cast("application/x-esri-shape")
  @scala.inline
  def `applicationSlashx-google-chrome-extension`: typings.fileType.fileTypeStrings.`applicationSlashx-google-chrome-extension` = this.cast("application/x-google-chrome-extension")
  @scala.inline
  def `applicationSlashx-lzip`: typings.fileType.fileTypeStrings.`applicationSlashx-lzip` = this.cast("application/x-lzip")
  @scala.inline
  def `applicationSlashx-mie`: typings.fileType.fileTypeStrings.`applicationSlashx-mie` = this.cast("application/x-mie")
  @scala.inline
  def `applicationSlashx-mobipocket-ebook`: typings.fileType.fileTypeStrings.`applicationSlashx-mobipocket-ebook` = this.cast("application/x-mobipocket-ebook")
  @scala.inline
  def `applicationSlashx-msdownload`: typings.fileType.fileTypeStrings.`applicationSlashx-msdownload` = this.cast("application/x-msdownload")
  @scala.inline
  def `applicationSlashx-msi`: typings.fileType.fileTypeStrings.`applicationSlashx-msi` = this.cast("application/x-msi")
  @scala.inline
  def `applicationSlashx-nintendo-nes-rom`: typings.fileType.fileTypeStrings.`applicationSlashx-nintendo-nes-rom` = this.cast("application/x-nintendo-nes-rom")
  @scala.inline
  def `applicationSlashx-rar-compressed`: typings.fileType.fileTypeStrings.`applicationSlashx-rar-compressed` = this.cast("application/x-rar-compressed")
  @scala.inline
  def `applicationSlashx-rpm`: typings.fileType.fileTypeStrings.`applicationSlashx-rpm` = this.cast("application/x-rpm")
  @scala.inline
  def `applicationSlashx-shockwave-flash`: typings.fileType.fileTypeStrings.`applicationSlashx-shockwave-flash` = this.cast("application/x-shockwave-flash")
  @scala.inline
  def `applicationSlashx-sqlite3`: typings.fileType.fileTypeStrings.`applicationSlashx-sqlite3` = this.cast("application/x-sqlite3")
  @scala.inline
  def `applicationSlashx-tar`: typings.fileType.fileTypeStrings.`applicationSlashx-tar` = this.cast("application/x-tar")
  @scala.inline
  def `applicationSlashx-unix-archive`: typings.fileType.fileTypeStrings.`applicationSlashx-unix-archive` = this.cast("application/x-unix-archive")
  @scala.inline
  def `applicationSlashx-xpinstall`: typings.fileType.fileTypeStrings.`applicationSlashx-xpinstall` = this.cast("application/x-xpinstall")
  @scala.inline
  def `applicationSlashx-xz`: typings.fileType.fileTypeStrings.`applicationSlashx-xz` = this.cast("application/x-xz")
  @scala.inline
  def applicationSlashxDotappleDotalias: typings.fileType.fileTypeStrings.applicationSlashxDotappleDotalias = this.cast("application/x.apple.alias")
  @scala.inline
  def applicationSlashxDotmsDotshortcut: typings.fileType.fileTypeStrings.applicationSlashxDotmsDotshortcut = this.cast("application/x.ms.shortcut")
  @scala.inline
  def applicationSlashxml: typings.fileType.fileTypeStrings.applicationSlashxml = this.cast("application/xml")
  @scala.inline
  def applicationSlashzip: typings.fileType.fileTypeStrings.applicationSlashzip = this.cast("application/zip")
  @scala.inline
  def audioSlashaac: typings.fileType.fileTypeStrings.audioSlashaac = this.cast("audio/aac")
  @scala.inline
  def audioSlashaiff: typings.fileType.fileTypeStrings.audioSlashaiff = this.cast("audio/aiff")
  @scala.inline
  def audioSlashamr: typings.fileType.fileTypeStrings.audioSlashamr = this.cast("audio/amr")
  @scala.inline
  def audioSlashape: typings.fileType.fileTypeStrings.audioSlashape = this.cast("audio/ape")
  @scala.inline
  def audioSlashmidi: typings.fileType.fileTypeStrings.audioSlashmidi = this.cast("audio/midi")
  @scala.inline
  def audioSlashmp4: typings.fileType.fileTypeStrings.audioSlashmp4 = this.cast("audio/mp4")
  @scala.inline
  def audioSlashmpeg: typings.fileType.fileTypeStrings.audioSlashmpeg = this.cast("audio/mpeg")
  @scala.inline
  def audioSlashogg: typings.fileType.fileTypeStrings.audioSlashogg = this.cast("audio/ogg")
  @scala.inline
  def audioSlashopus: typings.fileType.fileTypeStrings.audioSlashopus = this.cast("audio/opus")
  @scala.inline
  def audioSlashqcelp: typings.fileType.fileTypeStrings.audioSlashqcelp = this.cast("audio/qcelp")
  @scala.inline
  def `audioSlashvndDotdolbyDotdd-raw`: typings.fileType.fileTypeStrings.`audioSlashvndDotdolbyDotdd-raw` = this.cast("audio/vnd.dolby.dd-raw")
  @scala.inline
  def audioSlashvndDotwave: typings.fileType.fileTypeStrings.audioSlashvndDotwave = this.cast("audio/vnd.wave")
  @scala.inline
  def audioSlashwavpack: typings.fileType.fileTypeStrings.audioSlashwavpack = this.cast("audio/wavpack")
  @scala.inline
  def `audioSlashx-dsf`: typings.fileType.fileTypeStrings.`audioSlashx-dsf` = this.cast("audio/x-dsf")
  @scala.inline
  def `audioSlashx-flac`: typings.fileType.fileTypeStrings.`audioSlashx-flac` = this.cast("audio/x-flac")
  @scala.inline
  def `audioSlashx-it`: typings.fileType.fileTypeStrings.`audioSlashx-it` = this.cast("audio/x-it")
  @scala.inline
  def `audioSlashx-m4a`: typings.fileType.fileTypeStrings.`audioSlashx-m4a` = this.cast("audio/x-m4a")
  @scala.inline
  def `audioSlashx-ms-wma`: typings.fileType.fileTypeStrings.`audioSlashx-ms-wma` = this.cast("audio/x-ms-wma")
  @scala.inline
  def `audioSlashx-musepack`: typings.fileType.fileTypeStrings.`audioSlashx-musepack` = this.cast("audio/x-musepack")
  @scala.inline
  def `audioSlashx-s3m`: typings.fileType.fileTypeStrings.`audioSlashx-s3m` = this.cast("audio/x-s3m")
  @scala.inline
  def `audioSlashx-voc`: typings.fileType.fileTypeStrings.`audioSlashx-voc` = this.cast("audio/x-voc")
  @scala.inline
  def `audioSlashx-xm`: typings.fileType.fileTypeStrings.`audioSlashx-xm` = this.cast("audio/x-xm")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fontSlashotf: typings.fileType.fileTypeStrings.fontSlashotf = this.cast("font/otf")
  @scala.inline
  def fontSlashttf: typings.fileType.fileTypeStrings.fontSlashttf = this.cast("font/ttf")
  @scala.inline
  def fontSlashwoff: typings.fileType.fileTypeStrings.fontSlashwoff = this.cast("font/woff")
  @scala.inline
  def fontSlashwoff2: typings.fileType.fileTypeStrings.fontSlashwoff2 = this.cast("font/woff2")
  @scala.inline
  def imageSlashapng: typings.fileType.fileTypeStrings.imageSlashapng = this.cast("image/apng")
  @scala.inline
  def imageSlashbmp: typings.fileType.fileTypeStrings.imageSlashbmp = this.cast("image/bmp")
  @scala.inline
  def imageSlashbpg: typings.fileType.fileTypeStrings.imageSlashbpg = this.cast("image/bpg")
  @scala.inline
  def imageSlashflif: typings.fileType.fileTypeStrings.imageSlashflif = this.cast("image/flif")
  @scala.inline
  def imageSlashgif: typings.fileType.fileTypeStrings.imageSlashgif = this.cast("image/gif")
  @scala.inline
  def imageSlashheic: typings.fileType.fileTypeStrings.imageSlashheic = this.cast("image/heic")
  @scala.inline
  def `imageSlashheic-sequence`: typings.fileType.fileTypeStrings.`imageSlashheic-sequence` = this.cast("image/heic-sequence")
  @scala.inline
  def imageSlashheif: typings.fileType.fileTypeStrings.imageSlashheif = this.cast("image/heif")
  @scala.inline
  def `imageSlashheif-sequence`: typings.fileType.fileTypeStrings.`imageSlashheif-sequence` = this.cast("image/heif-sequence")
  @scala.inline
  def imageSlashjp2: typings.fileType.fileTypeStrings.imageSlashjp2 = this.cast("image/jp2")
  @scala.inline
  def imageSlashjpeg: typings.fileType.fileTypeStrings.imageSlashjpeg = this.cast("image/jpeg")
  @scala.inline
  def imageSlashjpm: typings.fileType.fileTypeStrings.imageSlashjpm = this.cast("image/jpm")
  @scala.inline
  def imageSlashjpx: typings.fileType.fileTypeStrings.imageSlashjpx = this.cast("image/jpx")
  @scala.inline
  def imageSlashktx: typings.fileType.fileTypeStrings.imageSlashktx = this.cast("image/ktx")
  @scala.inline
  def imageSlashmj2: typings.fileType.fileTypeStrings.imageSlashmj2 = this.cast("image/mj2")
  @scala.inline
  def imageSlashpng: typings.fileType.fileTypeStrings.imageSlashpng = this.cast("image/png")
  @scala.inline
  def imageSlashtiff: typings.fileType.fileTypeStrings.imageSlashtiff = this.cast("image/tiff")
  @scala.inline
  def imageSlashvndDotadobeDotphotoshop: typings.fileType.fileTypeStrings.imageSlashvndDotadobeDotphotoshop = this.cast("image/vnd.adobe.photoshop")
  @scala.inline
  def `imageSlashvndDotms-photo`: typings.fileType.fileTypeStrings.`imageSlashvndDotms-photo` = this.cast("image/vnd.ms-photo")
  @scala.inline
  def imageSlashwebp: typings.fileType.fileTypeStrings.imageSlashwebp = this.cast("image/webp")
  @scala.inline
  def `imageSlashx-adobe-dng`: typings.fileType.fileTypeStrings.`imageSlashx-adobe-dng` = this.cast("image/x-adobe-dng")
  @scala.inline
  def `imageSlashx-canon-cr2`: typings.fileType.fileTypeStrings.`imageSlashx-canon-cr2` = this.cast("image/x-canon-cr2")
  @scala.inline
  def `imageSlashx-canon-cr3`: typings.fileType.fileTypeStrings.`imageSlashx-canon-cr3` = this.cast("image/x-canon-cr3")
  @scala.inline
  def `imageSlashx-fujifilm-raf`: typings.fileType.fileTypeStrings.`imageSlashx-fujifilm-raf` = this.cast("image/x-fujifilm-raf")
  @scala.inline
  def `imageSlashx-icon`: typings.fileType.fileTypeStrings.`imageSlashx-icon` = this.cast("image/x-icon")
  @scala.inline
  def `imageSlashx-nikon-nef`: typings.fileType.fileTypeStrings.`imageSlashx-nikon-nef` = this.cast("image/x-nikon-nef")
  @scala.inline
  def `imageSlashx-olympus-orf`: typings.fileType.fileTypeStrings.`imageSlashx-olympus-orf` = this.cast("image/x-olympus-orf")
  @scala.inline
  def `imageSlashx-panasonic-rw2`: typings.fileType.fileTypeStrings.`imageSlashx-panasonic-rw2` = this.cast("image/x-panasonic-rw2")
  @scala.inline
  def `imageSlashx-sony-arw`: typings.fileType.fileTypeStrings.`imageSlashx-sony-arw` = this.cast("image/x-sony-arw")
  @scala.inline
  def `modelSlashgltf-binary`: typings.fileType.fileTypeStrings.`modelSlashgltf-binary` = this.cast("model/gltf-binary")
  @scala.inline
  def textSlashcalendar: typings.fileType.fileTypeStrings.textSlashcalendar = this.cast("text/calendar")
  @scala.inline
  def videoSlash3gpp: typings.fileType.fileTypeStrings.videoSlash3gpp = this.cast("video/3gpp")
  @scala.inline
  def videoSlash3gpp2: typings.fileType.fileTypeStrings.videoSlash3gpp2 = this.cast("video/3gpp2")
  @scala.inline
  def videoSlashMP1S: typings.fileType.fileTypeStrings.videoSlashMP1S = this.cast("video/MP1S")
  @scala.inline
  def videoSlashMP2P: typings.fileType.fileTypeStrings.videoSlashMP2P = this.cast("video/MP2P")
  @scala.inline
  def videoSlashmp2t: typings.fileType.fileTypeStrings.videoSlashmp2t = this.cast("video/mp2t")
  @scala.inline
  def videoSlashmp4: typings.fileType.fileTypeStrings.videoSlashmp4 = this.cast("video/mp4")
  @scala.inline
  def videoSlashmpeg: typings.fileType.fileTypeStrings.videoSlashmpeg = this.cast("video/mpeg")
  @scala.inline
  def videoSlashogg: typings.fileType.fileTypeStrings.videoSlashogg = this.cast("video/ogg")
  @scala.inline
  def videoSlashquicktime: typings.fileType.fileTypeStrings.videoSlashquicktime = this.cast("video/quicktime")
  @scala.inline
  def videoSlashvndDotavi: typings.fileType.fileTypeStrings.videoSlashvndDotavi = this.cast("video/vnd.avi")
  @scala.inline
  def videoSlashwebm: typings.fileType.fileTypeStrings.videoSlashwebm = this.cast("video/webm")
  @scala.inline
  def `videoSlashx-flv`: typings.fileType.fileTypeStrings.`videoSlashx-flv` = this.cast("video/x-flv")
  @scala.inline
  def `videoSlashx-m4v`: typings.fileType.fileTypeStrings.`videoSlashx-m4v` = this.cast("video/x-m4v")
  @scala.inline
  def `videoSlashx-matroska`: typings.fileType.fileTypeStrings.`videoSlashx-matroska` = this.cast("video/x-matroska")
  @scala.inline
  def `videoSlashx-ms-asf`: typings.fileType.fileTypeStrings.`videoSlashx-ms-asf` = this.cast("video/x-ms-asf")
}

