package typings.esbuild

import typings.esbuild.mod.Charset
import typings.esbuild.mod.Drop
import typings.esbuild.mod.Format
import typings.esbuild.mod.ImportKind
import typings.esbuild.mod.Loader
import typings.esbuild.mod.LogLevel
import typings.esbuild.mod.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esbuildStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with Loader
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait ascii
    extends StObject
       with Charset
  inline def ascii: ascii = "ascii".asInstanceOf[ascii]
  
  @js.native
  sealed trait automatic extends StObject
  inline def automatic: automatic = "automatic".asInstanceOf[automatic]
  
  @js.native
  sealed trait base64
    extends StObject
       with Loader
  inline def base64: base64 = "base64".asInstanceOf[base64]
  
  @js.native
  sealed trait binary
    extends StObject
       with Loader
  inline def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait both extends StObject
  inline def both: both = "both".asInstanceOf[both]
  
  @js.native
  sealed trait browser
    extends StObject
       with Platform
  inline def browser: browser = "browser".asInstanceOf[browser]
  
  @js.native
  sealed trait cjs
    extends StObject
       with Format
  inline def cjs: cjs = "cjs".asInstanceOf[cjs]
  
  @js.native
  sealed trait console
    extends StObject
       with Drop
  inline def console: console = "console".asInstanceOf[console]
  
  @js.native
  sealed trait copy
    extends StObject
       with Loader
  inline def copy: copy = "copy".asInstanceOf[copy]
  
  @js.native
  sealed trait css
    extends StObject
       with Loader
  inline def css: css = "css".asInstanceOf[css]
  
  @js.native
  sealed trait dataurl
    extends StObject
       with Loader
  inline def dataurl: dataurl = "dataurl".asInstanceOf[dataurl]
  
  @js.native
  sealed trait debug
    extends StObject
       with LogLevel
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait debugger
    extends StObject
       with Drop
  inline def debugger: debugger = "debugger".asInstanceOf[debugger]
  
  @js.native
  sealed trait `dynamic-import`
    extends StObject
       with ImportKind
  inline def `dynamic-import`: `dynamic-import` = "dynamic-import".asInstanceOf[`dynamic-import`]
  
  @js.native
  sealed trait empty
    extends StObject
       with Loader
  inline def empty: empty = "empty".asInstanceOf[empty]
  
  @js.native
  sealed trait `entry-point`
    extends StObject
       with ImportKind
  inline def `entry-point`: `entry-point` = "entry-point".asInstanceOf[`entry-point`]
  
  @js.native
  sealed trait eof extends StObject
  inline def eof: eof = "eof".asInstanceOf[eof]
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevel
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait esm
    extends StObject
       with Format
  inline def esm: esm = "esm".asInstanceOf[esm]
  
  @js.native
  sealed trait external extends StObject
  inline def external: external = "external".asInstanceOf[external]
  
  @js.native
  sealed trait file
    extends StObject
       with Loader
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait `file-loader` extends StObject
  inline def `file-loader`: `file-loader` = "file-loader".asInstanceOf[`file-loader`]
  
  @js.native
  sealed trait iife
    extends StObject
       with Format
  inline def iife: iife = "iife".asInstanceOf[iife]
  
  @js.native
  sealed trait `import-rule`
    extends StObject
       with ImportKind
  inline def `import-rule`: `import-rule` = "import-rule".asInstanceOf[`import-rule`]
  
  @js.native
  sealed trait `import-statement`
    extends StObject
       with ImportKind
  inline def `import-statement`: `import-statement` = "import-statement".asInstanceOf[`import-statement`]
  
  @js.native
  sealed trait info
    extends StObject
       with LogLevel
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait `inline` extends StObject
  inline def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @js.native
  sealed trait js_
    extends StObject
       with Loader
  inline def js_ : js_ = "js".asInstanceOf[js_]
  
  @js.native
  sealed trait json
    extends StObject
       with Loader
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait jsx
    extends StObject
       with Loader
  inline def jsx: jsx = "jsx".asInstanceOf[jsx]
  
  @js.native
  sealed trait linked extends StObject
  inline def linked: linked = "linked".asInstanceOf[linked]
  
  @js.native
  sealed trait neutral
    extends StObject
       with Platform
  inline def neutral: neutral = "neutral".asInstanceOf[neutral]
  
  @js.native
  sealed trait node
    extends StObject
       with Platform
  inline def node: node = "node".asInstanceOf[node]
  
  @js.native
  sealed trait none extends StObject
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait preserve extends StObject
  inline def preserve: preserve = "preserve".asInstanceOf[preserve]
  
  @js.native
  sealed trait react extends StObject
  inline def react: react = "react".asInstanceOf[react]
  
  @js.native
  sealed trait `react-jsx` extends StObject
  inline def `react-jsx`: `react-jsx` = "react-jsx".asInstanceOf[`react-jsx`]
  
  @js.native
  sealed trait `react-jsxdev` extends StObject
  inline def `react-jsxdev`: `react-jsxdev` = "react-jsxdev".asInstanceOf[`react-jsxdev`]
  
  @js.native
  sealed trait remove extends StObject
  inline def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait `require-call`
    extends StObject
       with ImportKind
  inline def `require-call`: `require-call` = "require-call".asInstanceOf[`require-call`]
  
  @js.native
  sealed trait `require-resolve`
    extends StObject
       with ImportKind
  inline def `require-resolve`: `require-resolve` = "require-resolve".asInstanceOf[`require-resolve`]
  
  @js.native
  sealed trait silent
    extends StObject
       with LogLevel
  inline def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait text
    extends StObject
       with Loader
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait transform extends StObject
  inline def transform: transform = "transform".asInstanceOf[transform]
  
  @js.native
  sealed trait ts
    extends StObject
       with Loader
  inline def ts: ts = "ts".asInstanceOf[ts]
  
  @js.native
  sealed trait tsx
    extends StObject
       with Loader
  inline def tsx: tsx = "tsx".asInstanceOf[tsx]
  
  @js.native
  sealed trait `url-token`
    extends StObject
       with ImportKind
  inline def `url-token`: `url-token` = "url-token".asInstanceOf[`url-token`]
  
  @js.native
  sealed trait utf8
    extends StObject
       with Charset
  inline def utf8: utf8 = "utf8".asInstanceOf[utf8]
  
  @js.native
  sealed trait verbose
    extends StObject
       with LogLevel
  inline def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @js.native
  sealed trait warning
    extends StObject
       with LogLevel
  inline def warning: warning = "warning".asInstanceOf[warning]
}
