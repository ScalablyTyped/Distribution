package typings.fileType

import typings.node.nodeColonstreamMod.Readable
import typings.std.ReadonlySet
import typings.strtok3.libTypesMod.ITokenizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("file-type/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fileTypeFromBuffer(buffer: js.typedarray.ArrayBuffer): js.Promise[js.UndefOr[FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeFromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[FileTypeResult]]]
  inline def fileTypeFromBuffer(buffer: js.typedarray.Uint8Array): js.Promise[js.UndefOr[FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeFromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[FileTypeResult]]]
  
  inline def fileTypeFromStream(stream: Readable): js.Promise[js.UndefOr[FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeFromStream")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[FileTypeResult]]]
  
  inline def fileTypeFromTokenizer(tokenizer: ITokenizer): js.Promise[js.UndefOr[FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeFromTokenizer")(tokenizer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[FileTypeResult]]]
  
  inline def fileTypeStream(readableStream: Readable): js.Promise[ReadableStreamWithFileType] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeStream")(readableStream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReadableStreamWithFileType]]
  inline def fileTypeStream(readableStream: Readable, options: StreamOptions): js.Promise[ReadableStreamWithFileType] = (^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeStream")(readableStream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadableStreamWithFileType]]
  
  @JSImport("file-type/core", "supportedExtensions")
  @js.native
  val supportedExtensions: ReadonlySet[FileExtension] = js.native
  
  @JSImport("file-type/core", "supportedMimeTypes")
  @js.native
  val supportedMimeTypes: ReadonlySet[MimeType] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.fileType.fileTypeStrings.jpg
    - typings.fileType.fileTypeStrings.png
    - typings.fileType.fileTypeStrings.apng
    - typings.fileType.fileTypeStrings.gif
    - typings.fileType.fileTypeStrings.webp
    - typings.fileType.fileTypeStrings.flif
    - typings.fileType.fileTypeStrings.xcf
    - typings.fileType.fileTypeStrings.cr2
    - typings.fileType.fileTypeStrings.cr3
    - typings.fileType.fileTypeStrings.orf
    - typings.fileType.fileTypeStrings.arw
    - typings.fileType.fileTypeStrings.dng
    - typings.fileType.fileTypeStrings.nef
    - typings.fileType.fileTypeStrings.rw2
    - typings.fileType.fileTypeStrings.raf
    - typings.fileType.fileTypeStrings.tif
    - typings.fileType.fileTypeStrings.bmp
    - typings.fileType.fileTypeStrings.icns
    - typings.fileType.fileTypeStrings.jxr
    - typings.fileType.fileTypeStrings.psd
    - typings.fileType.fileTypeStrings.indd
    - typings.fileType.fileTypeStrings.zip
    - typings.fileType.fileTypeStrings.tar
    - typings.fileType.fileTypeStrings.rar
    - typings.fileType.fileTypeStrings.gz
    - typings.fileType.fileTypeStrings.bz2
    - typings.fileType.fileTypeStrings.`7z`
    - typings.fileType.fileTypeStrings.dmg
    - typings.fileType.fileTypeStrings.mp4
    - typings.fileType.fileTypeStrings.mid
    - typings.fileType.fileTypeStrings.mkv
    - typings.fileType.fileTypeStrings.webm
    - typings.fileType.fileTypeStrings.mov
    - typings.fileType.fileTypeStrings.avi
    - typings.fileType.fileTypeStrings.mpg
    - typings.fileType.fileTypeStrings.mp2
    - typings.fileType.fileTypeStrings.mp3
    - typings.fileType.fileTypeStrings.m4a
    - typings.fileType.fileTypeStrings.ogg
    - typings.fileType.fileTypeStrings.opus
    - typings.fileType.fileTypeStrings.flac
    - typings.fileType.fileTypeStrings.wav
    - typings.fileType.fileTypeStrings.qcp
    - typings.fileType.fileTypeStrings.amr
    - typings.fileType.fileTypeStrings.pdf
    - typings.fileType.fileTypeStrings.epub
    - typings.fileType.fileTypeStrings.mobi
    - typings.fileType.fileTypeStrings.elf
    - typings.fileType.fileTypeStrings.exe
    - typings.fileType.fileTypeStrings.swf
    - typings.fileType.fileTypeStrings.rtf
    - typings.fileType.fileTypeStrings.woff
    - typings.fileType.fileTypeStrings.woff2
    - typings.fileType.fileTypeStrings.eot
    - typings.fileType.fileTypeStrings.ttf
    - typings.fileType.fileTypeStrings.otf
    - typings.fileType.fileTypeStrings.ico
    - typings.fileType.fileTypeStrings.flv
    - typings.fileType.fileTypeStrings.ps
    - typings.fileType.fileTypeStrings.xz
    - typings.fileType.fileTypeStrings.sqlite
    - typings.fileType.fileTypeStrings.nes
    - typings.fileType.fileTypeStrings.crx
    - typings.fileType.fileTypeStrings.xpi
    - typings.fileType.fileTypeStrings.cab
    - typings.fileType.fileTypeStrings.deb
    - typings.fileType.fileTypeStrings.ar
    - typings.fileType.fileTypeStrings.rpm
    - typings.fileType.fileTypeStrings.Z
    - typings.fileType.fileTypeStrings.lz
    - typings.fileType.fileTypeStrings.cfb
    - typings.fileType.fileTypeStrings.mxf
    - typings.fileType.fileTypeStrings.mts
    - typings.fileType.fileTypeStrings.wasm
    - typings.fileType.fileTypeStrings.blend
    - typings.fileType.fileTypeStrings.bpg
    - typings.fileType.fileTypeStrings.docx
    - typings.fileType.fileTypeStrings.pptx
    - typings.fileType.fileTypeStrings.xlsx
    - typings.fileType.fileTypeStrings.`3gp`
    - typings.fileType.fileTypeStrings.`3g2`
    - typings.fileType.fileTypeStrings.jp2
    - typings.fileType.fileTypeStrings.jpm
    - typings.fileType.fileTypeStrings.jpx
    - typings.fileType.fileTypeStrings.mj2
    - typings.fileType.fileTypeStrings.aif
    - typings.fileType.fileTypeStrings.odt
    - typings.fileType.fileTypeStrings.ods
    - typings.fileType.fileTypeStrings.odp
    - typings.fileType.fileTypeStrings.xml
    - typings.fileType.fileTypeStrings.heic
    - typings.fileType.fileTypeStrings.cur
    - typings.fileType.fileTypeStrings.ktx
    - typings.fileType.fileTypeStrings.ape
    - typings.fileType.fileTypeStrings.wv
    - typings.fileType.fileTypeStrings.asf
    - typings.fileType.fileTypeStrings.dcm
    - typings.fileType.fileTypeStrings.mpc
    - typings.fileType.fileTypeStrings.ics
    - typings.fileType.fileTypeStrings.glb
    - typings.fileType.fileTypeStrings.pcap
    - typings.fileType.fileTypeStrings.dsf
    - typings.fileType.fileTypeStrings.lnk
    - typings.fileType.fileTypeStrings.alias
    - typings.fileType.fileTypeStrings.voc
    - typings.fileType.fileTypeStrings.ac3
    - typings.fileType.fileTypeStrings.m4b
    - typings.fileType.fileTypeStrings.m4p
    - typings.fileType.fileTypeStrings.m4v
    - typings.fileType.fileTypeStrings.f4a
    - typings.fileType.fileTypeStrings.f4b
    - typings.fileType.fileTypeStrings.f4p
    - typings.fileType.fileTypeStrings.f4v
    - typings.fileType.fileTypeStrings.mie
    - typings.fileType.fileTypeStrings.ogv
    - typings.fileType.fileTypeStrings.ogm
    - typings.fileType.fileTypeStrings.oga
    - typings.fileType.fileTypeStrings.spx
    - typings.fileType.fileTypeStrings.ogx
    - typings.fileType.fileTypeStrings.arrow
    - typings.fileType.fileTypeStrings.shp
    - typings.fileType.fileTypeStrings.aac
    - typings.fileType.fileTypeStrings.mp1
    - typings.fileType.fileTypeStrings.it
    - typings.fileType.fileTypeStrings.s3m
    - typings.fileType.fileTypeStrings.xm
    - typings.fileType.fileTypeStrings.ai
    - typings.fileType.fileTypeStrings.skp
    - typings.fileType.fileTypeStrings.avif
    - typings.fileType.fileTypeStrings.eps
    - typings.fileType.fileTypeStrings.lzh
    - typings.fileType.fileTypeStrings.pgp
    - typings.fileType.fileTypeStrings.asar
    - typings.fileType.fileTypeStrings.stl
    - typings.fileType.fileTypeStrings.chm
    - typings.fileType.fileTypeStrings.`3mf`
    - typings.fileType.fileTypeStrings.zst
    - typings.fileType.fileTypeStrings.jxl
    - typings.fileType.fileTypeStrings.vcf
  */
  trait FileExtension extends StObject
  object FileExtension {
    
    inline def `3g2`: typings.fileType.fileTypeStrings.`3g2` = "3g2".asInstanceOf[typings.fileType.fileTypeStrings.`3g2`]
    
    inline def `3gp`: typings.fileType.fileTypeStrings.`3gp` = "3gp".asInstanceOf[typings.fileType.fileTypeStrings.`3gp`]
    
    inline def `3mf`: typings.fileType.fileTypeStrings.`3mf` = "3mf".asInstanceOf[typings.fileType.fileTypeStrings.`3mf`]
    
    inline def `7z`: typings.fileType.fileTypeStrings.`7z` = "7z".asInstanceOf[typings.fileType.fileTypeStrings.`7z`]
    
    inline def Z: typings.fileType.fileTypeStrings.Z = "Z".asInstanceOf[typings.fileType.fileTypeStrings.Z]
    
    inline def aac: typings.fileType.fileTypeStrings.aac = "aac".asInstanceOf[typings.fileType.fileTypeStrings.aac]
    
    inline def ac3: typings.fileType.fileTypeStrings.ac3 = "ac3".asInstanceOf[typings.fileType.fileTypeStrings.ac3]
    
    inline def ai: typings.fileType.fileTypeStrings.ai = "ai".asInstanceOf[typings.fileType.fileTypeStrings.ai]
    
    inline def aif: typings.fileType.fileTypeStrings.aif = "aif".asInstanceOf[typings.fileType.fileTypeStrings.aif]
    
    inline def alias: typings.fileType.fileTypeStrings.alias = "alias".asInstanceOf[typings.fileType.fileTypeStrings.alias]
    
    inline def amr: typings.fileType.fileTypeStrings.amr = "amr".asInstanceOf[typings.fileType.fileTypeStrings.amr]
    
    inline def ape: typings.fileType.fileTypeStrings.ape = "ape".asInstanceOf[typings.fileType.fileTypeStrings.ape]
    
    inline def apng: typings.fileType.fileTypeStrings.apng = "apng".asInstanceOf[typings.fileType.fileTypeStrings.apng]
    
    inline def ar: typings.fileType.fileTypeStrings.ar = "ar".asInstanceOf[typings.fileType.fileTypeStrings.ar]
    
    inline def arrow: typings.fileType.fileTypeStrings.arrow = "arrow".asInstanceOf[typings.fileType.fileTypeStrings.arrow]
    
    inline def arw: typings.fileType.fileTypeStrings.arw = "arw".asInstanceOf[typings.fileType.fileTypeStrings.arw]
    
    inline def asar: typings.fileType.fileTypeStrings.asar = "asar".asInstanceOf[typings.fileType.fileTypeStrings.asar]
    
    inline def asf: typings.fileType.fileTypeStrings.asf = "asf".asInstanceOf[typings.fileType.fileTypeStrings.asf]
    
    inline def avi: typings.fileType.fileTypeStrings.avi = "avi".asInstanceOf[typings.fileType.fileTypeStrings.avi]
    
    inline def avif: typings.fileType.fileTypeStrings.avif = "avif".asInstanceOf[typings.fileType.fileTypeStrings.avif]
    
    inline def blend: typings.fileType.fileTypeStrings.blend = "blend".asInstanceOf[typings.fileType.fileTypeStrings.blend]
    
    inline def bmp: typings.fileType.fileTypeStrings.bmp = "bmp".asInstanceOf[typings.fileType.fileTypeStrings.bmp]
    
    inline def bpg: typings.fileType.fileTypeStrings.bpg = "bpg".asInstanceOf[typings.fileType.fileTypeStrings.bpg]
    
    inline def bz2: typings.fileType.fileTypeStrings.bz2 = "bz2".asInstanceOf[typings.fileType.fileTypeStrings.bz2]
    
    inline def cab: typings.fileType.fileTypeStrings.cab = "cab".asInstanceOf[typings.fileType.fileTypeStrings.cab]
    
    inline def cfb: typings.fileType.fileTypeStrings.cfb = "cfb".asInstanceOf[typings.fileType.fileTypeStrings.cfb]
    
    inline def chm: typings.fileType.fileTypeStrings.chm = "chm".asInstanceOf[typings.fileType.fileTypeStrings.chm]
    
    inline def cr2: typings.fileType.fileTypeStrings.cr2 = "cr2".asInstanceOf[typings.fileType.fileTypeStrings.cr2]
    
    inline def cr3: typings.fileType.fileTypeStrings.cr3 = "cr3".asInstanceOf[typings.fileType.fileTypeStrings.cr3]
    
    inline def crx: typings.fileType.fileTypeStrings.crx = "crx".asInstanceOf[typings.fileType.fileTypeStrings.crx]
    
    inline def cur: typings.fileType.fileTypeStrings.cur = "cur".asInstanceOf[typings.fileType.fileTypeStrings.cur]
    
    inline def dcm: typings.fileType.fileTypeStrings.dcm = "dcm".asInstanceOf[typings.fileType.fileTypeStrings.dcm]
    
    inline def deb: typings.fileType.fileTypeStrings.deb = "deb".asInstanceOf[typings.fileType.fileTypeStrings.deb]
    
    inline def dmg: typings.fileType.fileTypeStrings.dmg = "dmg".asInstanceOf[typings.fileType.fileTypeStrings.dmg]
    
    inline def dng: typings.fileType.fileTypeStrings.dng = "dng".asInstanceOf[typings.fileType.fileTypeStrings.dng]
    
    inline def docx: typings.fileType.fileTypeStrings.docx = "docx".asInstanceOf[typings.fileType.fileTypeStrings.docx]
    
    inline def dsf: typings.fileType.fileTypeStrings.dsf = "dsf".asInstanceOf[typings.fileType.fileTypeStrings.dsf]
    
    inline def elf: typings.fileType.fileTypeStrings.elf = "elf".asInstanceOf[typings.fileType.fileTypeStrings.elf]
    
    inline def eot: typings.fileType.fileTypeStrings.eot = "eot".asInstanceOf[typings.fileType.fileTypeStrings.eot]
    
    inline def eps: typings.fileType.fileTypeStrings.eps = "eps".asInstanceOf[typings.fileType.fileTypeStrings.eps]
    
    inline def epub: typings.fileType.fileTypeStrings.epub = "epub".asInstanceOf[typings.fileType.fileTypeStrings.epub]
    
    inline def exe: typings.fileType.fileTypeStrings.exe = "exe".asInstanceOf[typings.fileType.fileTypeStrings.exe]
    
    inline def f4a: typings.fileType.fileTypeStrings.f4a = "f4a".asInstanceOf[typings.fileType.fileTypeStrings.f4a]
    
    inline def f4b: typings.fileType.fileTypeStrings.f4b = "f4b".asInstanceOf[typings.fileType.fileTypeStrings.f4b]
    
    inline def f4p: typings.fileType.fileTypeStrings.f4p = "f4p".asInstanceOf[typings.fileType.fileTypeStrings.f4p]
    
    inline def f4v: typings.fileType.fileTypeStrings.f4v = "f4v".asInstanceOf[typings.fileType.fileTypeStrings.f4v]
    
    inline def flac: typings.fileType.fileTypeStrings.flac = "flac".asInstanceOf[typings.fileType.fileTypeStrings.flac]
    
    inline def flif: typings.fileType.fileTypeStrings.flif = "flif".asInstanceOf[typings.fileType.fileTypeStrings.flif]
    
    inline def flv: typings.fileType.fileTypeStrings.flv = "flv".asInstanceOf[typings.fileType.fileTypeStrings.flv]
    
    inline def gif: typings.fileType.fileTypeStrings.gif = "gif".asInstanceOf[typings.fileType.fileTypeStrings.gif]
    
    inline def glb: typings.fileType.fileTypeStrings.glb = "glb".asInstanceOf[typings.fileType.fileTypeStrings.glb]
    
    inline def gz: typings.fileType.fileTypeStrings.gz = "gz".asInstanceOf[typings.fileType.fileTypeStrings.gz]
    
    inline def heic: typings.fileType.fileTypeStrings.heic = "heic".asInstanceOf[typings.fileType.fileTypeStrings.heic]
    
    inline def icns: typings.fileType.fileTypeStrings.icns = "icns".asInstanceOf[typings.fileType.fileTypeStrings.icns]
    
    inline def ico: typings.fileType.fileTypeStrings.ico = "ico".asInstanceOf[typings.fileType.fileTypeStrings.ico]
    
    inline def ics: typings.fileType.fileTypeStrings.ics = "ics".asInstanceOf[typings.fileType.fileTypeStrings.ics]
    
    inline def indd: typings.fileType.fileTypeStrings.indd = "indd".asInstanceOf[typings.fileType.fileTypeStrings.indd]
    
    inline def it: typings.fileType.fileTypeStrings.it = "it".asInstanceOf[typings.fileType.fileTypeStrings.it]
    
    inline def jp2: typings.fileType.fileTypeStrings.jp2 = "jp2".asInstanceOf[typings.fileType.fileTypeStrings.jp2]
    
    inline def jpg: typings.fileType.fileTypeStrings.jpg = "jpg".asInstanceOf[typings.fileType.fileTypeStrings.jpg]
    
    inline def jpm: typings.fileType.fileTypeStrings.jpm = "jpm".asInstanceOf[typings.fileType.fileTypeStrings.jpm]
    
    inline def jpx: typings.fileType.fileTypeStrings.jpx = "jpx".asInstanceOf[typings.fileType.fileTypeStrings.jpx]
    
    inline def jxl: typings.fileType.fileTypeStrings.jxl = "jxl".asInstanceOf[typings.fileType.fileTypeStrings.jxl]
    
    inline def jxr: typings.fileType.fileTypeStrings.jxr = "jxr".asInstanceOf[typings.fileType.fileTypeStrings.jxr]
    
    inline def ktx: typings.fileType.fileTypeStrings.ktx = "ktx".asInstanceOf[typings.fileType.fileTypeStrings.ktx]
    
    inline def lnk: typings.fileType.fileTypeStrings.lnk = "lnk".asInstanceOf[typings.fileType.fileTypeStrings.lnk]
    
    inline def lz: typings.fileType.fileTypeStrings.lz = "lz".asInstanceOf[typings.fileType.fileTypeStrings.lz]
    
    inline def lzh: typings.fileType.fileTypeStrings.lzh = "lzh".asInstanceOf[typings.fileType.fileTypeStrings.lzh]
    
    inline def m4a: typings.fileType.fileTypeStrings.m4a = "m4a".asInstanceOf[typings.fileType.fileTypeStrings.m4a]
    
    inline def m4b: typings.fileType.fileTypeStrings.m4b = "m4b".asInstanceOf[typings.fileType.fileTypeStrings.m4b]
    
    inline def m4p: typings.fileType.fileTypeStrings.m4p = "m4p".asInstanceOf[typings.fileType.fileTypeStrings.m4p]
    
    inline def m4v: typings.fileType.fileTypeStrings.m4v = "m4v".asInstanceOf[typings.fileType.fileTypeStrings.m4v]
    
    inline def mid: typings.fileType.fileTypeStrings.mid = "mid".asInstanceOf[typings.fileType.fileTypeStrings.mid]
    
    inline def mie: typings.fileType.fileTypeStrings.mie = "mie".asInstanceOf[typings.fileType.fileTypeStrings.mie]
    
    inline def mj2: typings.fileType.fileTypeStrings.mj2 = "mj2".asInstanceOf[typings.fileType.fileTypeStrings.mj2]
    
    inline def mkv: typings.fileType.fileTypeStrings.mkv = "mkv".asInstanceOf[typings.fileType.fileTypeStrings.mkv]
    
    inline def mobi: typings.fileType.fileTypeStrings.mobi = "mobi".asInstanceOf[typings.fileType.fileTypeStrings.mobi]
    
    inline def mov: typings.fileType.fileTypeStrings.mov = "mov".asInstanceOf[typings.fileType.fileTypeStrings.mov]
    
    inline def mp1: typings.fileType.fileTypeStrings.mp1 = "mp1".asInstanceOf[typings.fileType.fileTypeStrings.mp1]
    
    inline def mp2: typings.fileType.fileTypeStrings.mp2 = "mp2".asInstanceOf[typings.fileType.fileTypeStrings.mp2]
    
    inline def mp3: typings.fileType.fileTypeStrings.mp3 = "mp3".asInstanceOf[typings.fileType.fileTypeStrings.mp3]
    
    inline def mp4: typings.fileType.fileTypeStrings.mp4 = "mp4".asInstanceOf[typings.fileType.fileTypeStrings.mp4]
    
    inline def mpc: typings.fileType.fileTypeStrings.mpc = "mpc".asInstanceOf[typings.fileType.fileTypeStrings.mpc]
    
    inline def mpg: typings.fileType.fileTypeStrings.mpg = "mpg".asInstanceOf[typings.fileType.fileTypeStrings.mpg]
    
    inline def mts: typings.fileType.fileTypeStrings.mts = "mts".asInstanceOf[typings.fileType.fileTypeStrings.mts]
    
    inline def mxf: typings.fileType.fileTypeStrings.mxf = "mxf".asInstanceOf[typings.fileType.fileTypeStrings.mxf]
    
    inline def nef: typings.fileType.fileTypeStrings.nef = "nef".asInstanceOf[typings.fileType.fileTypeStrings.nef]
    
    inline def nes: typings.fileType.fileTypeStrings.nes = "nes".asInstanceOf[typings.fileType.fileTypeStrings.nes]
    
    inline def odp: typings.fileType.fileTypeStrings.odp = "odp".asInstanceOf[typings.fileType.fileTypeStrings.odp]
    
    inline def ods: typings.fileType.fileTypeStrings.ods = "ods".asInstanceOf[typings.fileType.fileTypeStrings.ods]
    
    inline def odt: typings.fileType.fileTypeStrings.odt = "odt".asInstanceOf[typings.fileType.fileTypeStrings.odt]
    
    inline def oga: typings.fileType.fileTypeStrings.oga = "oga".asInstanceOf[typings.fileType.fileTypeStrings.oga]
    
    inline def ogg: typings.fileType.fileTypeStrings.ogg = "ogg".asInstanceOf[typings.fileType.fileTypeStrings.ogg]
    
    inline def ogm: typings.fileType.fileTypeStrings.ogm = "ogm".asInstanceOf[typings.fileType.fileTypeStrings.ogm]
    
    inline def ogv: typings.fileType.fileTypeStrings.ogv = "ogv".asInstanceOf[typings.fileType.fileTypeStrings.ogv]
    
    inline def ogx: typings.fileType.fileTypeStrings.ogx = "ogx".asInstanceOf[typings.fileType.fileTypeStrings.ogx]
    
    inline def opus: typings.fileType.fileTypeStrings.opus = "opus".asInstanceOf[typings.fileType.fileTypeStrings.opus]
    
    inline def orf: typings.fileType.fileTypeStrings.orf = "orf".asInstanceOf[typings.fileType.fileTypeStrings.orf]
    
    inline def otf: typings.fileType.fileTypeStrings.otf = "otf".asInstanceOf[typings.fileType.fileTypeStrings.otf]
    
    inline def pcap: typings.fileType.fileTypeStrings.pcap = "pcap".asInstanceOf[typings.fileType.fileTypeStrings.pcap]
    
    inline def pdf: typings.fileType.fileTypeStrings.pdf = "pdf".asInstanceOf[typings.fileType.fileTypeStrings.pdf]
    
    inline def pgp: typings.fileType.fileTypeStrings.pgp = "pgp".asInstanceOf[typings.fileType.fileTypeStrings.pgp]
    
    inline def png: typings.fileType.fileTypeStrings.png = "png".asInstanceOf[typings.fileType.fileTypeStrings.png]
    
    inline def pptx: typings.fileType.fileTypeStrings.pptx = "pptx".asInstanceOf[typings.fileType.fileTypeStrings.pptx]
    
    inline def ps: typings.fileType.fileTypeStrings.ps = "ps".asInstanceOf[typings.fileType.fileTypeStrings.ps]
    
    inline def psd: typings.fileType.fileTypeStrings.psd = "psd".asInstanceOf[typings.fileType.fileTypeStrings.psd]
    
    inline def qcp: typings.fileType.fileTypeStrings.qcp = "qcp".asInstanceOf[typings.fileType.fileTypeStrings.qcp]
    
    inline def raf: typings.fileType.fileTypeStrings.raf = "raf".asInstanceOf[typings.fileType.fileTypeStrings.raf]
    
    inline def rar: typings.fileType.fileTypeStrings.rar = "rar".asInstanceOf[typings.fileType.fileTypeStrings.rar]
    
    inline def rpm: typings.fileType.fileTypeStrings.rpm = "rpm".asInstanceOf[typings.fileType.fileTypeStrings.rpm]
    
    inline def rtf: typings.fileType.fileTypeStrings.rtf = "rtf".asInstanceOf[typings.fileType.fileTypeStrings.rtf]
    
    inline def rw2: typings.fileType.fileTypeStrings.rw2 = "rw2".asInstanceOf[typings.fileType.fileTypeStrings.rw2]
    
    inline def s3m: typings.fileType.fileTypeStrings.s3m = "s3m".asInstanceOf[typings.fileType.fileTypeStrings.s3m]
    
    inline def shp: typings.fileType.fileTypeStrings.shp = "shp".asInstanceOf[typings.fileType.fileTypeStrings.shp]
    
    inline def skp: typings.fileType.fileTypeStrings.skp = "skp".asInstanceOf[typings.fileType.fileTypeStrings.skp]
    
    inline def spx: typings.fileType.fileTypeStrings.spx = "spx".asInstanceOf[typings.fileType.fileTypeStrings.spx]
    
    inline def sqlite: typings.fileType.fileTypeStrings.sqlite = "sqlite".asInstanceOf[typings.fileType.fileTypeStrings.sqlite]
    
    inline def stl: typings.fileType.fileTypeStrings.stl = "stl".asInstanceOf[typings.fileType.fileTypeStrings.stl]
    
    inline def swf: typings.fileType.fileTypeStrings.swf = "swf".asInstanceOf[typings.fileType.fileTypeStrings.swf]
    
    inline def tar: typings.fileType.fileTypeStrings.tar = "tar".asInstanceOf[typings.fileType.fileTypeStrings.tar]
    
    inline def tif: typings.fileType.fileTypeStrings.tif = "tif".asInstanceOf[typings.fileType.fileTypeStrings.tif]
    
    inline def ttf: typings.fileType.fileTypeStrings.ttf = "ttf".asInstanceOf[typings.fileType.fileTypeStrings.ttf]
    
    inline def vcf: typings.fileType.fileTypeStrings.vcf = "vcf".asInstanceOf[typings.fileType.fileTypeStrings.vcf]
    
    inline def voc: typings.fileType.fileTypeStrings.voc = "voc".asInstanceOf[typings.fileType.fileTypeStrings.voc]
    
    inline def wasm: typings.fileType.fileTypeStrings.wasm = "wasm".asInstanceOf[typings.fileType.fileTypeStrings.wasm]
    
    inline def wav: typings.fileType.fileTypeStrings.wav = "wav".asInstanceOf[typings.fileType.fileTypeStrings.wav]
    
    inline def webm: typings.fileType.fileTypeStrings.webm = "webm".asInstanceOf[typings.fileType.fileTypeStrings.webm]
    
    inline def webp: typings.fileType.fileTypeStrings.webp = "webp".asInstanceOf[typings.fileType.fileTypeStrings.webp]
    
    inline def woff: typings.fileType.fileTypeStrings.woff = "woff".asInstanceOf[typings.fileType.fileTypeStrings.woff]
    
    inline def woff2: typings.fileType.fileTypeStrings.woff2 = "woff2".asInstanceOf[typings.fileType.fileTypeStrings.woff2]
    
    inline def wv: typings.fileType.fileTypeStrings.wv = "wv".asInstanceOf[typings.fileType.fileTypeStrings.wv]
    
    inline def xcf: typings.fileType.fileTypeStrings.xcf = "xcf".asInstanceOf[typings.fileType.fileTypeStrings.xcf]
    
    inline def xlsx: typings.fileType.fileTypeStrings.xlsx = "xlsx".asInstanceOf[typings.fileType.fileTypeStrings.xlsx]
    
    inline def xm: typings.fileType.fileTypeStrings.xm = "xm".asInstanceOf[typings.fileType.fileTypeStrings.xm]
    
    inline def xml: typings.fileType.fileTypeStrings.xml = "xml".asInstanceOf[typings.fileType.fileTypeStrings.xml]
    
    inline def xpi: typings.fileType.fileTypeStrings.xpi = "xpi".asInstanceOf[typings.fileType.fileTypeStrings.xpi]
    
    inline def xz: typings.fileType.fileTypeStrings.xz = "xz".asInstanceOf[typings.fileType.fileTypeStrings.xz]
    
    inline def zip: typings.fileType.fileTypeStrings.zip = "zip".asInstanceOf[typings.fileType.fileTypeStrings.zip]
    
    inline def zst: typings.fileType.fileTypeStrings.zst = "zst".asInstanceOf[typings.fileType.fileTypeStrings.zst]
  }
  
  trait FileTypeResult extends StObject {
    
    /**
    	One of the supported [file types](https://github.com/sindresorhus/file-type#supported-file-types).
    	*/
    val ext: FileExtension
    
    /**
    	The detected [MIME type](https://en.wikipedia.org/wiki/Internet_media_type).
    	*/
    val mime: MimeType
  }
  object FileTypeResult {
    
    inline def apply(ext: FileExtension, mime: MimeType): FileTypeResult = {
      val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileTypeResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileTypeResult] (val x: Self) extends AnyVal {
      
      inline def setExt(value: FileExtension): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setMime(value: MimeType): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    }
  }
  
  object MimeType {
    
    inline def applicationSlashdicom: typings.fileType.fileTypeStrings.applicationSlashdicom = "application/dicom".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashdicom]
    
    inline def applicationSlasheps: typings.fileType.fileTypeStrings.applicationSlasheps = "application/eps".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlasheps]
    
    inline def applicationSlashepubPlussignzip: typings.fileType.fileTypeStrings.applicationSlashepubPlussignzip = "application/epub+zip".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashepubPlussignzip]
    
    inline def applicationSlashgzip: typings.fileType.fileTypeStrings.applicationSlashgzip = "application/gzip".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashgzip]
    
    inline def applicationSlashmxf: typings.fileType.fileTypeStrings.applicationSlashmxf = "application/mxf".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashmxf]
    
    inline def applicationSlashogg: typings.fileType.fileTypeStrings.applicationSlashogg = "application/ogg".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashogg]
    
    inline def applicationSlashpdf: typings.fileType.fileTypeStrings.applicationSlashpdf = "application/pdf".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashpdf]
    
    inline def `applicationSlashpgp-encrypted`: typings.fileType.fileTypeStrings.`applicationSlashpgp-encrypted` = "application/pgp-encrypted".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashpgp-encrypted`]
    
    inline def applicationSlashpostscript: typings.fileType.fileTypeStrings.applicationSlashpostscript = "application/postscript".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashpostscript]
    
    inline def applicationSlashrtf: typings.fileType.fileTypeStrings.applicationSlashrtf = "application/rtf".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashrtf]
    
    inline def `applicationSlashvndDotms-asf`: typings.fileType.fileTypeStrings.`applicationSlashvndDotms-asf` = "application/vnd.ms-asf".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashvndDotms-asf`]
    
    inline def `applicationSlashvndDotms-cab-compressed`: typings.fileType.fileTypeStrings.`applicationSlashvndDotms-cab-compressed` = "application/vnd.ms-cab-compressed".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashvndDotms-cab-compressed`]
    
    inline def `applicationSlashvndDotms-fontobject`: typings.fileType.fileTypeStrings.`applicationSlashvndDotms-fontobject` = "application/vnd.ms-fontobject".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashvndDotms-fontobject`]
    
    inline def `applicationSlashvndDotms-htmlhelp`: typings.fileType.fileTypeStrings.`applicationSlashvndDotms-htmlhelp` = "application/vnd.ms-htmlhelp".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashvndDotms-htmlhelp`]
    
    inline def applicationSlashvndDotoasisDotopendocumentDotpresentation: typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotpresentation = "application/vnd.oasis.opendocument.presentation".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotpresentation]
    
    inline def applicationSlashvndDotoasisDotopendocumentDotspreadsheet: typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotspreadsheet = "application/vnd.oasis.opendocument.spreadsheet".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotspreadsheet]
    
    inline def applicationSlashvndDotoasisDotopendocumentDottext: typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDottext = "application/vnd.oasis.opendocument.text".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDottext]
    
    inline def `applicationSlashvndDotopenxmlformats-officedocumentDotpresentationmlDotpresentation`: /* application/vnd.openxmlformats-officedocument.presentationml.presentation */ String = "application/vnd.openxmlformats-officedocument.presentationml.presentation".asInstanceOf[/* application/vnd.openxmlformats-officedocument.presentationml.presentation */ String]
    
    inline def `applicationSlashvndDotopenxmlformats-officedocumentDotspreadsheetmlDotsheet`: /* application/vnd.openxmlformats-officedocument.spreadsheetml.sheet */ String = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet".asInstanceOf[/* application/vnd.openxmlformats-officedocument.spreadsheetml.sheet */ String]
    
    inline def `applicationSlashvndDotopenxmlformats-officedocumentDotwordprocessingmlDotdocument`: /* application/vnd.openxmlformats-officedocument.wordprocessingml.document */ String = "application/vnd.openxmlformats-officedocument.wordprocessingml.document".asInstanceOf[/* application/vnd.openxmlformats-officedocument.wordprocessingml.document */ String]
    
    inline def applicationSlashvndDotsketchupDotskp: typings.fileType.fileTypeStrings.applicationSlashvndDotsketchupDotskp = "application/vnd.sketchup.skp".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashvndDotsketchupDotskp]
    
    inline def applicationSlashvndDottcpdumpDotpcap: typings.fileType.fileTypeStrings.applicationSlashvndDottcpdumpDotpcap = "application/vnd.tcpdump.pcap".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashvndDottcpdumpDotpcap]
    
    inline def applicationSlashwasm: typings.fileType.fileTypeStrings.applicationSlashwasm = "application/wasm".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashwasm]
    
    inline def `applicationSlashx-7z-compressed`: typings.fileType.fileTypeStrings.`applicationSlashx-7z-compressed` = "application/x-7z-compressed".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-7z-compressed`]
    
    inline def `applicationSlashx-apache-arrow`: typings.fileType.fileTypeStrings.`applicationSlashx-apache-arrow` = "application/x-apache-arrow".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-apache-arrow`]
    
    inline def `applicationSlashx-apple-diskimage`: typings.fileType.fileTypeStrings.`applicationSlashx-apple-diskimage` = "application/x-apple-diskimage".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-apple-diskimage`]
    
    inline def `applicationSlashx-asar`: typings.fileType.fileTypeStrings.`applicationSlashx-asar` = "application/x-asar".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-asar`]
    
    inline def `applicationSlashx-blender`: typings.fileType.fileTypeStrings.`applicationSlashx-blender` = "application/x-blender".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-blender`]
    
    inline def `applicationSlashx-bzip2`: typings.fileType.fileTypeStrings.`applicationSlashx-bzip2` = "application/x-bzip2".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-bzip2`]
    
    inline def `applicationSlashx-cfb`: typings.fileType.fileTypeStrings.`applicationSlashx-cfb` = "application/x-cfb".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-cfb`]
    
    inline def `applicationSlashx-compress`: typings.fileType.fileTypeStrings.`applicationSlashx-compress` = "application/x-compress".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-compress`]
    
    inline def `applicationSlashx-deb`: typings.fileType.fileTypeStrings.`applicationSlashx-deb` = "application/x-deb".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-deb`]
    
    inline def `applicationSlashx-elf`: typings.fileType.fileTypeStrings.`applicationSlashx-elf` = "application/x-elf".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-elf`]
    
    inline def `applicationSlashx-esri-shape`: typings.fileType.fileTypeStrings.`applicationSlashx-esri-shape` = "application/x-esri-shape".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-esri-shape`]
    
    inline def `applicationSlashx-google-chrome-extension`: typings.fileType.fileTypeStrings.`applicationSlashx-google-chrome-extension` = "application/x-google-chrome-extension".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-google-chrome-extension`]
    
    inline def `applicationSlashx-indesign`: typings.fileType.fileTypeStrings.`applicationSlashx-indesign` = "application/x-indesign".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-indesign`]
    
    inline def `applicationSlashx-lzh-compressed`: typings.fileType.fileTypeStrings.`applicationSlashx-lzh-compressed` = "application/x-lzh-compressed".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-lzh-compressed`]
    
    inline def `applicationSlashx-lzip`: typings.fileType.fileTypeStrings.`applicationSlashx-lzip` = "application/x-lzip".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-lzip`]
    
    inline def `applicationSlashx-mie`: typings.fileType.fileTypeStrings.`applicationSlashx-mie` = "application/x-mie".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-mie`]
    
    inline def `applicationSlashx-mobipocket-ebook`: typings.fileType.fileTypeStrings.`applicationSlashx-mobipocket-ebook` = "application/x-mobipocket-ebook".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-mobipocket-ebook`]
    
    inline def `applicationSlashx-msdownload`: typings.fileType.fileTypeStrings.`applicationSlashx-msdownload` = "application/x-msdownload".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-msdownload`]
    
    inline def `applicationSlashx-nintendo-nes-rom`: typings.fileType.fileTypeStrings.`applicationSlashx-nintendo-nes-rom` = "application/x-nintendo-nes-rom".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-nintendo-nes-rom`]
    
    inline def `applicationSlashx-rar-compressed`: typings.fileType.fileTypeStrings.`applicationSlashx-rar-compressed` = "application/x-rar-compressed".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-rar-compressed`]
    
    inline def `applicationSlashx-rpm`: typings.fileType.fileTypeStrings.`applicationSlashx-rpm` = "application/x-rpm".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-rpm`]
    
    inline def `applicationSlashx-shockwave-flash`: typings.fileType.fileTypeStrings.`applicationSlashx-shockwave-flash` = "application/x-shockwave-flash".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-shockwave-flash`]
    
    inline def `applicationSlashx-sqlite3`: typings.fileType.fileTypeStrings.`applicationSlashx-sqlite3` = "application/x-sqlite3".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-sqlite3`]
    
    inline def `applicationSlashx-tar`: typings.fileType.fileTypeStrings.`applicationSlashx-tar` = "application/x-tar".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-tar`]
    
    inline def `applicationSlashx-unix-archive`: typings.fileType.fileTypeStrings.`applicationSlashx-unix-archive` = "application/x-unix-archive".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-unix-archive`]
    
    inline def `applicationSlashx-xpinstall`: typings.fileType.fileTypeStrings.`applicationSlashx-xpinstall` = "application/x-xpinstall".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-xpinstall`]
    
    inline def `applicationSlashx-xz`: typings.fileType.fileTypeStrings.`applicationSlashx-xz` = "application/x-xz".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-xz`]
    
    inline def applicationSlashxDotappleDotalias: typings.fileType.fileTypeStrings.applicationSlashxDotappleDotalias = "application/x.apple.alias".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashxDotappleDotalias]
    
    inline def applicationSlashxDotmsDotshortcut: typings.fileType.fileTypeStrings.applicationSlashxDotmsDotshortcut = "application/x.ms.shortcut".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashxDotmsDotshortcut]
    
    inline def applicationSlashxml: typings.fileType.fileTypeStrings.applicationSlashxml = "application/xml".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashxml]
    
    inline def applicationSlashzip: typings.fileType.fileTypeStrings.applicationSlashzip = "application/zip".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashzip]
    
    inline def applicationSlashzstd: typings.fileType.fileTypeStrings.applicationSlashzstd = "application/zstd".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashzstd]
    
    inline def audioSlashaac: typings.fileType.fileTypeStrings.audioSlashaac = "audio/aac".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashaac]
    
    inline def audioSlashaiff: typings.fileType.fileTypeStrings.audioSlashaiff = "audio/aiff".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashaiff]
    
    inline def audioSlashamr: typings.fileType.fileTypeStrings.audioSlashamr = "audio/amr".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashamr]
    
    inline def audioSlashape: typings.fileType.fileTypeStrings.audioSlashape = "audio/ape".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashape]
    
    inline def audioSlashmidi: typings.fileType.fileTypeStrings.audioSlashmidi = "audio/midi".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashmidi]
    
    inline def audioSlashmp4: typings.fileType.fileTypeStrings.audioSlashmp4 = "audio/mp4".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashmp4]
    
    inline def audioSlashmpeg: typings.fileType.fileTypeStrings.audioSlashmpeg = "audio/mpeg".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashmpeg]
    
    inline def audioSlashogg: typings.fileType.fileTypeStrings.audioSlashogg = "audio/ogg".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashogg]
    
    inline def audioSlashopus: typings.fileType.fileTypeStrings.audioSlashopus = "audio/opus".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashopus]
    
    inline def audioSlashqcelp: typings.fileType.fileTypeStrings.audioSlashqcelp = "audio/qcelp".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashqcelp]
    
    inline def `audioSlashvndDotdolbyDotdd-raw`: typings.fileType.fileTypeStrings.`audioSlashvndDotdolbyDotdd-raw` = "audio/vnd.dolby.dd-raw".asInstanceOf[typings.fileType.fileTypeStrings.`audioSlashvndDotdolbyDotdd-raw`]
    
    inline def audioSlashvndDotwave: typings.fileType.fileTypeStrings.audioSlashvndDotwave = "audio/vnd.wave".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashvndDotwave]
    
    inline def audioSlashwavpack: typings.fileType.fileTypeStrings.audioSlashwavpack = "audio/wavpack".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashwavpack]
    
    inline def `audioSlashx-dsf`: typings.fileType.fileTypeStrings.`audioSlashx-dsf` = "audio/x-dsf".asInstanceOf[typings.fileType.fileTypeStrings.`audioSlashx-dsf`]
    
    inline def `audioSlashx-flac`: typings.fileType.fileTypeStrings.`audioSlashx-flac` = "audio/x-flac".asInstanceOf[typings.fileType.fileTypeStrings.`audioSlashx-flac`]
    
    inline def `audioSlashx-it`: typings.fileType.fileTypeStrings.`audioSlashx-it` = "audio/x-it".asInstanceOf[typings.fileType.fileTypeStrings.`audioSlashx-it`]
    
    inline def `audioSlashx-m4a`: typings.fileType.fileTypeStrings.`audioSlashx-m4a` = "audio/x-m4a".asInstanceOf[typings.fileType.fileTypeStrings.`audioSlashx-m4a`]
    
    inline def `audioSlashx-ms-asf`: typings.fileType.fileTypeStrings.`audioSlashx-ms-asf` = "audio/x-ms-asf".asInstanceOf[typings.fileType.fileTypeStrings.`audioSlashx-ms-asf`]
    
    inline def `audioSlashx-musepack`: typings.fileType.fileTypeStrings.`audioSlashx-musepack` = "audio/x-musepack".asInstanceOf[typings.fileType.fileTypeStrings.`audioSlashx-musepack`]
    
    inline def `audioSlashx-s3m`: typings.fileType.fileTypeStrings.`audioSlashx-s3m` = "audio/x-s3m".asInstanceOf[typings.fileType.fileTypeStrings.`audioSlashx-s3m`]
    
    inline def `audioSlashx-voc`: typings.fileType.fileTypeStrings.`audioSlashx-voc` = "audio/x-voc".asInstanceOf[typings.fileType.fileTypeStrings.`audioSlashx-voc`]
    
    inline def `audioSlashx-xm`: typings.fileType.fileTypeStrings.`audioSlashx-xm` = "audio/x-xm".asInstanceOf[typings.fileType.fileTypeStrings.`audioSlashx-xm`]
    
    inline def fontSlashotf: typings.fileType.fileTypeStrings.fontSlashotf = "font/otf".asInstanceOf[typings.fileType.fileTypeStrings.fontSlashotf]
    
    inline def fontSlashttf: typings.fileType.fileTypeStrings.fontSlashttf = "font/ttf".asInstanceOf[typings.fileType.fileTypeStrings.fontSlashttf]
    
    inline def fontSlashwoff: typings.fileType.fileTypeStrings.fontSlashwoff = "font/woff".asInstanceOf[typings.fileType.fileTypeStrings.fontSlashwoff]
    
    inline def fontSlashwoff2: typings.fileType.fileTypeStrings.fontSlashwoff2 = "font/woff2".asInstanceOf[typings.fileType.fileTypeStrings.fontSlashwoff2]
    
    inline def imageSlashapng: typings.fileType.fileTypeStrings.imageSlashapng = "image/apng".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashapng]
    
    inline def imageSlashavif: typings.fileType.fileTypeStrings.imageSlashavif = "image/avif".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashavif]
    
    inline def imageSlashbmp: typings.fileType.fileTypeStrings.imageSlashbmp = "image/bmp".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashbmp]
    
    inline def imageSlashbpg: typings.fileType.fileTypeStrings.imageSlashbpg = "image/bpg".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashbpg]
    
    inline def imageSlashflif: typings.fileType.fileTypeStrings.imageSlashflif = "image/flif".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashflif]
    
    inline def imageSlashgif: typings.fileType.fileTypeStrings.imageSlashgif = "image/gif".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashgif]
    
    inline def imageSlashheic: typings.fileType.fileTypeStrings.imageSlashheic = "image/heic".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashheic]
    
    inline def `imageSlashheic-sequence`: typings.fileType.fileTypeStrings.`imageSlashheic-sequence` = "image/heic-sequence".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashheic-sequence`]
    
    inline def imageSlashheif: typings.fileType.fileTypeStrings.imageSlashheif = "image/heif".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashheif]
    
    inline def `imageSlashheif-sequence`: typings.fileType.fileTypeStrings.`imageSlashheif-sequence` = "image/heif-sequence".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashheif-sequence`]
    
    inline def imageSlashicns: typings.fileType.fileTypeStrings.imageSlashicns = "image/icns".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashicns]
    
    inline def imageSlashjp2: typings.fileType.fileTypeStrings.imageSlashjp2 = "image/jp2".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashjp2]
    
    inline def imageSlashjpeg: typings.fileType.fileTypeStrings.imageSlashjpeg = "image/jpeg".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashjpeg]
    
    inline def imageSlashjpm: typings.fileType.fileTypeStrings.imageSlashjpm = "image/jpm".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashjpm]
    
    inline def imageSlashjpx: typings.fileType.fileTypeStrings.imageSlashjpx = "image/jpx".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashjpx]
    
    inline def imageSlashjxl: typings.fileType.fileTypeStrings.imageSlashjxl = "image/jxl".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashjxl]
    
    inline def imageSlashktx: typings.fileType.fileTypeStrings.imageSlashktx = "image/ktx".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashktx]
    
    inline def imageSlashmj2: typings.fileType.fileTypeStrings.imageSlashmj2 = "image/mj2".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashmj2]
    
    inline def imageSlashpng: typings.fileType.fileTypeStrings.imageSlashpng = "image/png".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashpng]
    
    inline def imageSlashtiff: typings.fileType.fileTypeStrings.imageSlashtiff = "image/tiff".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashtiff]
    
    inline def imageSlashvndDotadobeDotphotoshop: typings.fileType.fileTypeStrings.imageSlashvndDotadobeDotphotoshop = "image/vnd.adobe.photoshop".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashvndDotadobeDotphotoshop]
    
    inline def `imageSlashvndDotms-photo`: typings.fileType.fileTypeStrings.`imageSlashvndDotms-photo` = "image/vnd.ms-photo".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashvndDotms-photo`]
    
    inline def imageSlashwebp: typings.fileType.fileTypeStrings.imageSlashwebp = "image/webp".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashwebp]
    
    inline def `imageSlashx-adobe-dng`: typings.fileType.fileTypeStrings.`imageSlashx-adobe-dng` = "image/x-adobe-dng".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashx-adobe-dng`]
    
    inline def `imageSlashx-canon-cr2`: typings.fileType.fileTypeStrings.`imageSlashx-canon-cr2` = "image/x-canon-cr2".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashx-canon-cr2`]
    
    inline def `imageSlashx-canon-cr3`: typings.fileType.fileTypeStrings.`imageSlashx-canon-cr3` = "image/x-canon-cr3".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashx-canon-cr3`]
    
    inline def `imageSlashx-fujifilm-raf`: typings.fileType.fileTypeStrings.`imageSlashx-fujifilm-raf` = "image/x-fujifilm-raf".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashx-fujifilm-raf`]
    
    inline def `imageSlashx-icon`: typings.fileType.fileTypeStrings.`imageSlashx-icon` = "image/x-icon".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashx-icon`]
    
    inline def `imageSlashx-nikon-nef`: typings.fileType.fileTypeStrings.`imageSlashx-nikon-nef` = "image/x-nikon-nef".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashx-nikon-nef`]
    
    inline def `imageSlashx-olympus-orf`: typings.fileType.fileTypeStrings.`imageSlashx-olympus-orf` = "image/x-olympus-orf".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashx-olympus-orf`]
    
    inline def `imageSlashx-panasonic-rw2`: typings.fileType.fileTypeStrings.`imageSlashx-panasonic-rw2` = "image/x-panasonic-rw2".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashx-panasonic-rw2`]
    
    inline def `imageSlashx-sony-arw`: typings.fileType.fileTypeStrings.`imageSlashx-sony-arw` = "image/x-sony-arw".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashx-sony-arw`]
    
    inline def `imageSlashx-xcf`: typings.fileType.fileTypeStrings.`imageSlashx-xcf` = "image/x-xcf".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashx-xcf`]
    
    inline def modelSlash3mf: typings.fileType.fileTypeStrings.modelSlash3mf = "model/3mf".asInstanceOf[typings.fileType.fileTypeStrings.modelSlash3mf]
    
    inline def `modelSlashgltf-binary`: typings.fileType.fileTypeStrings.`modelSlashgltf-binary` = "model/gltf-binary".asInstanceOf[typings.fileType.fileTypeStrings.`modelSlashgltf-binary`]
    
    inline def modelSlashstl: typings.fileType.fileTypeStrings.modelSlashstl = "model/stl".asInstanceOf[typings.fileType.fileTypeStrings.modelSlashstl]
    
    inline def textSlashcalendar: typings.fileType.fileTypeStrings.textSlashcalendar = "text/calendar".asInstanceOf[typings.fileType.fileTypeStrings.textSlashcalendar]
    
    inline def textSlashvcard: typings.fileType.fileTypeStrings.textSlashvcard = "text/vcard".asInstanceOf[typings.fileType.fileTypeStrings.textSlashvcard]
    
    inline def videoSlash3gpp: typings.fileType.fileTypeStrings.videoSlash3gpp = "video/3gpp".asInstanceOf[typings.fileType.fileTypeStrings.videoSlash3gpp]
    
    inline def videoSlash3gpp2: typings.fileType.fileTypeStrings.videoSlash3gpp2 = "video/3gpp2".asInstanceOf[typings.fileType.fileTypeStrings.videoSlash3gpp2]
    
    inline def videoSlashMP1S: typings.fileType.fileTypeStrings.videoSlashMP1S = "video/MP1S".asInstanceOf[typings.fileType.fileTypeStrings.videoSlashMP1S]
    
    inline def videoSlashMP2P: typings.fileType.fileTypeStrings.videoSlashMP2P = "video/MP2P".asInstanceOf[typings.fileType.fileTypeStrings.videoSlashMP2P]
    
    inline def videoSlashmp2t: typings.fileType.fileTypeStrings.videoSlashmp2t = "video/mp2t".asInstanceOf[typings.fileType.fileTypeStrings.videoSlashmp2t]
    
    inline def videoSlashmp4: typings.fileType.fileTypeStrings.videoSlashmp4 = "video/mp4".asInstanceOf[typings.fileType.fileTypeStrings.videoSlashmp4]
    
    inline def videoSlashmpeg: typings.fileType.fileTypeStrings.videoSlashmpeg = "video/mpeg".asInstanceOf[typings.fileType.fileTypeStrings.videoSlashmpeg]
    
    inline def videoSlashogg: typings.fileType.fileTypeStrings.videoSlashogg = "video/ogg".asInstanceOf[typings.fileType.fileTypeStrings.videoSlashogg]
    
    inline def videoSlashquicktime: typings.fileType.fileTypeStrings.videoSlashquicktime = "video/quicktime".asInstanceOf[typings.fileType.fileTypeStrings.videoSlashquicktime]
    
    inline def videoSlashvndDotavi: typings.fileType.fileTypeStrings.videoSlashvndDotavi = "video/vnd.avi".asInstanceOf[typings.fileType.fileTypeStrings.videoSlashvndDotavi]
    
    inline def videoSlashwebm: typings.fileType.fileTypeStrings.videoSlashwebm = "video/webm".asInstanceOf[typings.fileType.fileTypeStrings.videoSlashwebm]
    
    inline def `videoSlashx-flv`: typings.fileType.fileTypeStrings.`videoSlashx-flv` = "video/x-flv".asInstanceOf[typings.fileType.fileTypeStrings.`videoSlashx-flv`]
    
    inline def `videoSlashx-m4v`: typings.fileType.fileTypeStrings.`videoSlashx-m4v` = "video/x-m4v".asInstanceOf[typings.fileType.fileTypeStrings.`videoSlashx-m4v`]
    
    inline def `videoSlashx-matroska`: typings.fileType.fileTypeStrings.`videoSlashx-matroska` = "video/x-matroska".asInstanceOf[typings.fileType.fileTypeStrings.`videoSlashx-matroska`]
    
    inline def `videoSlashx-ms-asf`: typings.fileType.fileTypeStrings.`videoSlashx-ms-asf` = "video/x-ms-asf".asInstanceOf[typings.fileType.fileTypeStrings.`videoSlashx-ms-asf`]
  }
  /* Rewritten from type alias, can be one of: 
    - typings.fileType.fileTypeStrings.imageSlashjpeg
    - typings.fileType.fileTypeStrings.imageSlashpng
    - typings.fileType.fileTypeStrings.imageSlashgif
    - typings.fileType.fileTypeStrings.imageSlashwebp
    - typings.fileType.fileTypeStrings.imageSlashflif
    - typings.fileType.fileTypeStrings.`imageSlashx-xcf`
    - typings.fileType.fileTypeStrings.`imageSlashx-canon-cr2`
    - typings.fileType.fileTypeStrings.`imageSlashx-canon-cr3`
    - typings.fileType.fileTypeStrings.imageSlashtiff
    - typings.fileType.fileTypeStrings.imageSlashbmp
    - typings.fileType.fileTypeStrings.imageSlashicns
    - typings.fileType.fileTypeStrings.`imageSlashvndDotms-photo`
    - typings.fileType.fileTypeStrings.imageSlashvndDotadobeDotphotoshop
    - typings.fileType.fileTypeStrings.`applicationSlashx-indesign`
    - typings.fileType.fileTypeStrings.applicationSlashepubPlussignzip
    - typings.fileType.fileTypeStrings.`applicationSlashx-xpinstall`
    - typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDottext
    - typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotspreadsheet
    - typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotpresentation
    - / * application/vnd.openxmlformats-officedocument.wordprocessingml.document * / java.lang.String
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
    - typings.fileType.fileTypeStrings.`audioSlashx-ms-asf`
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
    - typings.fileType.fileTypeStrings.`applicationSlashx-elf`
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
    - typings.fileType.fileTypeStrings.applicationSlasheps
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
    - typings.fileType.fileTypeStrings.`applicationSlashx-cfb`
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
    - typings.fileType.fileTypeStrings.textSlashvcard
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
    - typings.fileType.fileTypeStrings.applicationSlashvndDotsketchupDotskp
    - typings.fileType.fileTypeStrings.imageSlashavif
    - typings.fileType.fileTypeStrings.`applicationSlashx-lzh-compressed`
    - typings.fileType.fileTypeStrings.`applicationSlashpgp-encrypted`
    - typings.fileType.fileTypeStrings.`applicationSlashx-asar`
    - typings.fileType.fileTypeStrings.modelSlashstl
    - typings.fileType.fileTypeStrings.`applicationSlashvndDotms-htmlhelp`
    - typings.fileType.fileTypeStrings.modelSlash3mf
    - typings.fileType.fileTypeStrings.imageSlashjxl
    - typings.fileType.fileTypeStrings.applicationSlashzstd
  */
  type MimeType = _MimeType | (/* application/vnd.openxmlformats-officedocument.wordprocessingml.document */ String)
  
  @js.native
  trait ReadableStreamWithFileType extends Readable {
    
    val fileType: js.UndefOr[FileTypeResult] = js.native
  }
  
  trait StreamOptions extends StObject {
    
    /**
    	The default sample size in bytes.
    	@default 4100
    	*/
    val sampleSize: js.UndefOr[Double] = js.undefined
  }
  object StreamOptions {
    
    inline def apply(): StreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamOptions] (val x: Self) extends AnyVal {
      
      inline def setSampleSize(value: Double): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
      
      inline def setSampleSizeUndefined: Self = StObject.set(x, "sampleSize", js.undefined)
    }
  }
  
  trait _MimeType extends StObject
}
