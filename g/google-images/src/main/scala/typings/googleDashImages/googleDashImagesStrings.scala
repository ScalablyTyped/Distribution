package typings.googleDashImages

import typings.googleDashImages.googleDashImagesMod.SearchColorType
import typings.googleDashImages.googleDashImagesMod.SearchDominantColor
import typings.googleDashImages.googleDashImagesMod.SearchImageSize
import typings.googleDashImages.googleDashImagesMod.SearchImageType
import typings.googleDashImages.googleDashImagesMod.SearchSafe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object googleDashImagesStrings {
  @js.native
  sealed trait black extends SearchDominantColor
  
  @js.native
  sealed trait blue extends SearchDominantColor
  
  @js.native
  sealed trait brown extends SearchDominantColor
  
  @js.native
  sealed trait clipart extends SearchImageType
  
  @js.native
  sealed trait color extends SearchColorType
  
  @js.native
  sealed trait face extends SearchImageType
  
  @js.native
  sealed trait gray
    extends SearchColorType
       with SearchDominantColor
  
  @js.native
  sealed trait green extends SearchDominantColor
  
  @js.native
  sealed trait high extends SearchSafe
  
  @js.native
  sealed trait huge extends SearchImageSize
  
  @js.native
  sealed trait icon extends SearchImageSize
  
  @js.native
  sealed trait large extends SearchImageSize
  
  @js.native
  sealed trait lineart extends SearchImageType
  
  @js.native
  sealed trait medium
    extends SearchImageSize
       with SearchSafe
  
  @js.native
  sealed trait mono extends SearchColorType
  
  @js.native
  sealed trait news extends SearchImageType
  
  @js.native
  sealed trait off extends SearchSafe
  
  @js.native
  sealed trait photo extends SearchImageType
  
  @js.native
  sealed trait pink extends SearchDominantColor
  
  @js.native
  sealed trait purple extends SearchDominantColor
  
  @js.native
  sealed trait small extends SearchImageSize
  
  @js.native
  sealed trait teal extends SearchDominantColor
  
  @js.native
  sealed trait white extends SearchDominantColor
  
  @js.native
  sealed trait xlarge extends SearchImageSize
  
  @js.native
  sealed trait xxlarge extends SearchImageSize
  
  @js.native
  sealed trait yellow extends SearchDominantColor
  
  @scala.inline
  def black: black = "black".asInstanceOf[black]
  @scala.inline
  def blue: blue = "blue".asInstanceOf[blue]
  @scala.inline
  def brown: brown = "brown".asInstanceOf[brown]
  @scala.inline
  def clipart: clipart = "clipart".asInstanceOf[clipart]
  @scala.inline
  def color: color = "color".asInstanceOf[color]
  @scala.inline
  def face: face = "face".asInstanceOf[face]
  @scala.inline
  def gray: gray = "gray".asInstanceOf[gray]
  @scala.inline
  def green: green = "green".asInstanceOf[green]
  @scala.inline
  def high: high = "high".asInstanceOf[high]
  @scala.inline
  def huge: huge = "huge".asInstanceOf[huge]
  @scala.inline
  def icon: icon = "icon".asInstanceOf[icon]
  @scala.inline
  def large: large = "large".asInstanceOf[large]
  @scala.inline
  def lineart: lineart = "lineart".asInstanceOf[lineart]
  @scala.inline
  def medium: medium = "medium".asInstanceOf[medium]
  @scala.inline
  def mono: mono = "mono".asInstanceOf[mono]
  @scala.inline
  def news: news = "news".asInstanceOf[news]
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  @scala.inline
  def photo: photo = "photo".asInstanceOf[photo]
  @scala.inline
  def pink: pink = "pink".asInstanceOf[pink]
  @scala.inline
  def purple: purple = "purple".asInstanceOf[purple]
  @scala.inline
  def small: small = "small".asInstanceOf[small]
  @scala.inline
  def teal: teal = "teal".asInstanceOf[teal]
  @scala.inline
  def white: white = "white".asInstanceOf[white]
  @scala.inline
  def xlarge: xlarge = "xlarge".asInstanceOf[xlarge]
  @scala.inline
  def xxlarge: xxlarge = "xxlarge".asInstanceOf[xxlarge]
  @scala.inline
  def yellow: yellow = "yellow".asInstanceOf[yellow]
}

