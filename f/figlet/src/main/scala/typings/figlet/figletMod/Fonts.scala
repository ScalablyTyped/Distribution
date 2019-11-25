package typings.figlet.figletMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.figlet.figletStrings.`1Row`
  - typings.figlet.figletStrings.`3-D`
  - typings.figlet.figletStrings.`3D Diagonal`
  - typings.figlet.figletStrings.`3D-ASCII`
  - typings.figlet.figletStrings.`3x5`
  - typings.figlet.figletStrings.`4Max`
  - typings.figlet.figletStrings.`5 Line Oblique`
  - typings.figlet.figletStrings.`AMC 3 Line`
  - typings.figlet.figletStrings.`AMC 3 Liv1`
  - typings.figlet.figletStrings.`AMC AAA01`
  - typings.figlet.figletStrings.`AMC Neko`
  - typings.figlet.figletStrings.`AMC Razor`
  - typings.figlet.figletStrings.`AMC Razor2`
  - typings.figlet.figletStrings.`AMC Slash`
  - typings.figlet.figletStrings.`AMC Slider`
  - typings.figlet.figletStrings.`AMC Thin`
  - typings.figlet.figletStrings.`AMC Tubes`
  - typings.figlet.figletStrings.`AMC Untitled`
  - typings.figlet.figletStrings.`ANSI Shadow`
  - typings.figlet.figletStrings.`ASCII New Roman`
  - typings.figlet.figletStrings.Acrobatic
  - typings.figlet.figletStrings.Alligator
  - typings.figlet.figletStrings.Alligator2
  - typings.figlet.figletStrings.Alpha
  - typings.figlet.figletStrings.Alphabet
  - typings.figlet.figletStrings.Arrows
  - typings.figlet.figletStrings.Avatar
  - typings.figlet.figletStrings.B1FF
  - typings.figlet.figletStrings.Banner
  - typings.figlet.figletStrings.`Banner3-D`
  - typings.figlet.figletStrings.Banner3
  - typings.figlet.figletStrings.Banner4
  - typings.figlet.figletStrings.Barbwire
  - typings.figlet.figletStrings.Basic
  - typings.figlet.figletStrings.Bear
  - typings.figlet.figletStrings.Bell
  - typings.figlet.figletStrings.Benjamin
  - typings.figlet.figletStrings.`Big Chief`
  - typings.figlet.figletStrings.`Big Money-ne`
  - typings.figlet.figletStrings.`Big Money-nw`
  - typings.figlet.figletStrings.`Big Money-se`
  - typings.figlet.figletStrings.`Big Money-sw`
  - typings.figlet.figletStrings.Big
  - typings.figlet.figletStrings.Bigfig
  - typings.figlet.figletStrings.Binary
  - typings.figlet.figletStrings.Block
  - typings.figlet.figletStrings.Blocks
  - typings.figlet.figletStrings.Bloody
  - typings.figlet.figletStrings.Bolger
  - typings.figlet.figletStrings.Braced
  - typings.figlet.figletStrings.Bright
  - typings.figlet.figletStrings.`Broadway KB`
  - typings.figlet.figletStrings.Broadway
  - typings.figlet.figletStrings.Bubble
  - typings.figlet.figletStrings.Bulbhead
  - typings.figlet.figletStrings.Caligraphy
  - typings.figlet.figletStrings.Caligraphy2
  - typings.figlet.figletStrings.`Calvin S`
  - typings.figlet.figletStrings.Cards
  - typings.figlet.figletStrings.Catwalk
  - typings.figlet.figletStrings.Chiseled
  - typings.figlet.figletStrings.Chunky
  - typings.figlet.figletStrings.Coinstak
  - typings.figlet.figletStrings.Cola
  - typings.figlet.figletStrings.Colossal
  - typings.figlet.figletStrings.Computer
  - typings.figlet.figletStrings.Contessa
  - typings.figlet.figletStrings.Contrast
  - typings.figlet.figletStrings.Cosmike
  - typings.figlet.figletStrings.Crawford
  - typings.figlet.figletStrings.Crawford2
  - typings.figlet.figletStrings.Crazy
  - typings.figlet.figletStrings.Cricket
  - typings.figlet.figletStrings.Cursive
  - typings.figlet.figletStrings.Cyberlarge
  - typings.figlet.figletStrings.Cybermedium
  - typings.figlet.figletStrings.Cybersmall
  - typings.figlet.figletStrings.Cygnet
  - typings.figlet.figletStrings.DANC4
  - typings.figlet.figletStrings.`DOS Rebel`
  - typings.figlet.figletStrings.DWhistled
  - typings.figlet.figletStrings.`Dancing Font`
  - typings.figlet.figletStrings.Decimal
  - typings.figlet.figletStrings.`Def Leppard`
  - typings.figlet.figletStrings.`Delta Corps Priest 1`
  - typings.figlet.figletStrings.Diamond
  - typings.figlet.figletStrings.`Diet Cola`
  - typings.figlet.figletStrings.Digital
  - typings.figlet.figletStrings.Doh
  - typings.figlet.figletStrings.Doom
  - typings.figlet.figletStrings.`Dot Matrix`
  - typings.figlet.figletStrings.`Double Shorts`
  - typings.figlet.figletStrings.Double
  - typings.figlet.figletStrings.`Dr Pepper`
  - typings.figlet.figletStrings.`Efti Chess`
  - typings.figlet.figletStrings.`Efti Font`
  - typings.figlet.figletStrings.`Efti Italic`
  - typings.figlet.figletStrings.`Efti Piti`
  - typings.figlet.figletStrings.`Efti Robot`
  - typings.figlet.figletStrings.`Efti Wall`
  - typings.figlet.figletStrings.`Efti Water`
  - typings.figlet.figletStrings.Electronic
  - typings.figlet.figletStrings.Elite
  - typings.figlet.figletStrings.Epic
  - typings.figlet.figletStrings.Fender
  - typings.figlet.figletStrings.Filter
  - typings.figlet.figletStrings.`Fire Font-k`
  - typings.figlet.figletStrings.`Fire Font-s`
  - typings.figlet.figletStrings.Flipped
  - typings.figlet.figletStrings.`Flower Power`
  - typings.figlet.figletStrings.`Four Tops`
  - typings.figlet.figletStrings.Fraktur
  - typings.figlet.figletStrings.`Fun Face`
  - typings.figlet.figletStrings.`Fun Faces`
  - typings.figlet.figletStrings.Fuzzy
  - typings.figlet.figletStrings.Georgi16
  - typings.figlet.figletStrings.Georgia11
  - typings.figlet.figletStrings.Ghost
  - typings.figlet.figletStrings.Ghoulish
  - typings.figlet.figletStrings.Glenyn
  - typings.figlet.figletStrings.Goofy
  - typings.figlet.figletStrings.Gothic
  - typings.figlet.figletStrings.Graceful
  - typings.figlet.figletStrings.Gradient
  - typings.figlet.figletStrings.Graffiti
  - typings.figlet.figletStrings.Greek
  - typings.figlet.figletStrings.`Heart Left`
  - typings.figlet.figletStrings.`Heart Right`
  - typings.figlet.figletStrings.`Henry 3D`
  - typings.figlet.figletStrings.Hex
  - typings.figlet.figletStrings.Hieroglyphs
  - typings.figlet.figletStrings.Hollywood
  - typings.figlet.figletStrings.`Horizontal Left`
  - typings.figlet.figletStrings.`Horizontal Right`
  - typings.figlet.figletStrings.`ICL-1900`
  - typings.figlet.figletStrings.Impossible
  - typings.figlet.figletStrings.Invita
  - typings.figlet.figletStrings.Isometric1
  - typings.figlet.figletStrings.Isometric2
  - typings.figlet.figletStrings.Isometric3
  - typings.figlet.figletStrings.Isometric4
  - typings.figlet.figletStrings.Italic
  - typings.figlet.figletStrings.Ivrit
  - typings.figlet.figletStrings.`JS Block Letters`
  - typings.figlet.figletStrings.`JS Bracket Letters`
  - typings.figlet.figletStrings.`JS Capital Curves`
  - typings.figlet.figletStrings.`JS Cursive`
  - typings.figlet.figletStrings.`JS Stick Letters`
  - typings.figlet.figletStrings.Jacky
  - typings.figlet.figletStrings.Jazmine
  - typings.figlet.figletStrings.Jerusalem
  - typings.figlet.figletStrings.Katakana
  - typings.figlet.figletStrings.Kban
  - typings.figlet.figletStrings.Keyboard
  - typings.figlet.figletStrings.Knob
  - typings.figlet.figletStrings.`Konto Slant`
  - typings.figlet.figletStrings.Konto
  - typings.figlet.figletStrings.LCD
  - typings.figlet.figletStrings.`Larry 3D 2`
  - typings.figlet.figletStrings.`Larry 3D`
  - typings.figlet.figletStrings.Lean
  - typings.figlet.figletStrings.Letters
  - typings.figlet.figletStrings.`Lil Devil`
  - typings.figlet.figletStrings.`Line Blocks`
  - typings.figlet.figletStrings.Linux
  - typings.figlet.figletStrings.Lockergnome
  - typings.figlet.figletStrings.Madrid
  - typings.figlet.figletStrings.Marquee
  - typings.figlet.figletStrings.Maxfour
  - typings.figlet.figletStrings.Merlin1
  - typings.figlet.figletStrings.Merlin2
  - typings.figlet.figletStrings.Mike
  - typings.figlet.figletStrings.Mini
  - typings.figlet.figletStrings.Mirror
  - typings.figlet.figletStrings.Mnemonic
  - typings.figlet.figletStrings.Modular
  - typings.figlet.figletStrings.Morse
  - typings.figlet.figletStrings.Morse2
  - typings.figlet.figletStrings.Moscow
  - typings.figlet.figletStrings.Mshebrew210
  - typings.figlet.figletStrings.Muzzle
  - typings.figlet.figletStrings.NScript
  - typings.figlet.figletStrings.`NT Greek`
  - typings.figlet.figletStrings.`NV Script`
  - typings.figlet.figletStrings.`Nancyj-Fancy`
  - typings.figlet.figletStrings.`Nancyj-Improved`
  - typings.figlet.figletStrings.`Nancyj-Underlined`
  - typings.figlet.figletStrings.Nancyj
  - typings.figlet.figletStrings.Nipples
  - typings.figlet.figletStrings.O8
  - typings.figlet.figletStrings.OS2
  - typings.figlet.figletStrings.Octal
  - typings.figlet.figletStrings.Ogre
  - typings.figlet.figletStrings.`Old Banner`
  - typings.figlet.figletStrings.`Patorjk_quotes Cheese`
  - typings.figlet.figletStrings.`Patorjk-HeX`
  - typings.figlet.figletStrings.Pawp
  - typings.figlet.figletStrings.`Peaks Slant`
  - typings.figlet.figletStrings.Peaks
  - typings.figlet.figletStrings.Pebbles
  - typings.figlet.figletStrings.Pepper
  - typings.figlet.figletStrings.Poison
  - typings.figlet.figletStrings.Puffy
  - typings.figlet.figletStrings.Puzzle
  - typings.figlet.figletStrings.Pyramid
  - typings.figlet.figletStrings.Rammstein
  - typings.figlet.figletStrings.Rectangles
  - typings.figlet.figletStrings.`Red Phoenix`
  - typings.figlet.figletStrings.Relief
  - typings.figlet.figletStrings.Relief2
  - typings.figlet.figletStrings.Reverse
  - typings.figlet.figletStrings.Roman
  - typings.figlet.figletStrings.Rot13
  - typings.figlet.figletStrings.Rotated
  - typings.figlet.figletStrings.Rounded
  - typings.figlet.figletStrings.`Rowan Cap`
  - typings.figlet.figletStrings.Rozzo
  - typings.figlet.figletStrings.Runic
  - typings.figlet.figletStrings.Runyc
  - typings.figlet.figletStrings.`S Blood`
  - typings.figlet.figletStrings.`SL Script`
  - typings.figlet.figletStrings.`Santa Clara`
  - typings.figlet.figletStrings.Script
  - typings.figlet.figletStrings.Serifcap
  - typings.figlet.figletStrings.Shadow
  - typings.figlet.figletStrings.Shimrod
  - typings.figlet.figletStrings.Short
  - typings.figlet.figletStrings.`Slant Relief`
  - typings.figlet.figletStrings.Slant
  - typings.figlet.figletStrings.Slide
  - typings.figlet.figletStrings.`Small Caps`
  - typings.figlet.figletStrings.`Small Isometric1`
  - typings.figlet.figletStrings.`Small Keyboard`
  - typings.figlet.figletStrings.`Small Poison`
  - typings.figlet.figletStrings.`Small Script`
  - typings.figlet.figletStrings.`Small Shadow`
  - typings.figlet.figletStrings.`Small Slant`
  - typings.figlet.figletStrings.`Small Tengwar`
  - typings.figlet.figletStrings.Small
  - typings.figlet.figletStrings.Soft
  - typings.figlet.figletStrings.Speed
  - typings.figlet.figletStrings.Spliff
  - typings.figlet.figletStrings.Stacey
  - typings.figlet.figletStrings.Stampate
  - typings.figlet.figletStrings.Stampatello
  - typings.figlet.figletStrings.Standard
  - typings.figlet.figletStrings.`Star Strips`
  - typings.figlet.figletStrings.`Star Wars`
  - typings.figlet.figletStrings.Stellar
  - typings.figlet.figletStrings.Stforek
  - typings.figlet.figletStrings.`Stick Letters`
  - typings.figlet.figletStrings.Stop
  - typings.figlet.figletStrings.Straight
  - typings.figlet.figletStrings.`Stronger Than All`
  - typings.figlet.figletStrings.`Sub-Zero`
  - typings.figlet.figletStrings.`Swamp Land`
  - typings.figlet.figletStrings.Swan
  - typings.figlet.figletStrings.Sweet
  - typings.figlet.figletStrings.THIS
  - typings.figlet.figletStrings.Tanja
  - typings.figlet.figletStrings.Tengwar
  - typings.figlet.figletStrings.Term
  - typings.figlet.figletStrings.Test1
  - typings.figlet.figletStrings.`The Edge`
  - typings.figlet.figletStrings.Thick
  - typings.figlet.figletStrings.Thin
  - typings.figlet.figletStrings.Thorned
  - typings.figlet.figletStrings.`Three Point`
  - typings.figlet.figletStrings.`Ticks Slant`
  - typings.figlet.figletStrings.Ticks
  - typings.figlet.figletStrings.Tiles
  - typings.figlet.figletStrings.`Tinker-Toy`
  - typings.figlet.figletStrings.Tombstone
  - typings.figlet.figletStrings.Train
  - typings.figlet.figletStrings.Trek
  - typings.figlet.figletStrings.Tsalagi
  - typings.figlet.figletStrings.Tubular
  - typings.figlet.figletStrings.Twisted
  - typings.figlet.figletStrings.`Two Point`
  - typings.figlet.figletStrings.`USA Flag`
  - typings.figlet.figletStrings.Univers
  - typings.figlet.figletStrings.Varsity
  - typings.figlet.figletStrings.Wavy
  - typings.figlet.figletStrings.Weird
  - typings.figlet.figletStrings.`Wet Letter`
  - typings.figlet.figletStrings.Whimsy
  - typings.figlet.figletStrings.Wow
*/
trait Fonts extends js.Object

object Fonts {
  @scala.inline
  def `1Row`: typings.figlet.figletStrings.`1Row` = this.cast("1Row")
  @scala.inline
  def `3-D`: typings.figlet.figletStrings.`3-D` = this.cast("3-D")
  @scala.inline
  def `3D Diagonal`: typings.figlet.figletStrings.`3D Diagonal` = this.cast("3D Diagonal")
  @scala.inline
  def `3D-ASCII`: typings.figlet.figletStrings.`3D-ASCII` = this.cast("3D-ASCII")
  @scala.inline
  def `3x5`: typings.figlet.figletStrings.`3x5` = this.cast("3x5")
  @scala.inline
  def `4Max`: typings.figlet.figletStrings.`4Max` = this.cast("4Max")
  @scala.inline
  def `5 Line Oblique`: typings.figlet.figletStrings.`5 Line Oblique` = this.cast("5 Line Oblique")
  @scala.inline
  def `AMC 3 Line`: typings.figlet.figletStrings.`AMC 3 Line` = this.cast("AMC 3 Line")
  @scala.inline
  def `AMC 3 Liv1`: typings.figlet.figletStrings.`AMC 3 Liv1` = this.cast("AMC 3 Liv1")
  @scala.inline
  def `AMC AAA01`: typings.figlet.figletStrings.`AMC AAA01` = this.cast("AMC AAA01")
  @scala.inline
  def `AMC Neko`: typings.figlet.figletStrings.`AMC Neko` = this.cast("AMC Neko")
  @scala.inline
  def `AMC Razor`: typings.figlet.figletStrings.`AMC Razor` = this.cast("AMC Razor")
  @scala.inline
  def `AMC Razor2`: typings.figlet.figletStrings.`AMC Razor2` = this.cast("AMC Razor2")
  @scala.inline
  def `AMC Slash`: typings.figlet.figletStrings.`AMC Slash` = this.cast("AMC Slash")
  @scala.inline
  def `AMC Slider`: typings.figlet.figletStrings.`AMC Slider` = this.cast("AMC Slider")
  @scala.inline
  def `AMC Thin`: typings.figlet.figletStrings.`AMC Thin` = this.cast("AMC Thin")
  @scala.inline
  def `AMC Tubes`: typings.figlet.figletStrings.`AMC Tubes` = this.cast("AMC Tubes")
  @scala.inline
  def `AMC Untitled`: typings.figlet.figletStrings.`AMC Untitled` = this.cast("AMC Untitled")
  @scala.inline
  def `ANSI Shadow`: typings.figlet.figletStrings.`ANSI Shadow` = this.cast("ANSI Shadow")
  @scala.inline
  def `ASCII New Roman`: typings.figlet.figletStrings.`ASCII New Roman` = this.cast("ASCII New Roman")
  @scala.inline
  def Acrobatic: typings.figlet.figletStrings.Acrobatic = this.cast("Acrobatic")
  @scala.inline
  def Alligator: typings.figlet.figletStrings.Alligator = this.cast("Alligator")
  @scala.inline
  def Alligator2: typings.figlet.figletStrings.Alligator2 = this.cast("Alligator2")
  @scala.inline
  def Alpha: typings.figlet.figletStrings.Alpha = this.cast("Alpha")
  @scala.inline
  def Alphabet: typings.figlet.figletStrings.Alphabet = this.cast("Alphabet")
  @scala.inline
  def Arrows: typings.figlet.figletStrings.Arrows = this.cast("Arrows")
  @scala.inline
  def Avatar: typings.figlet.figletStrings.Avatar = this.cast("Avatar")
  @scala.inline
  def B1FF: typings.figlet.figletStrings.B1FF = this.cast("B1FF")
  @scala.inline
  def Banner: typings.figlet.figletStrings.Banner = this.cast("Banner")
  @scala.inline
  def Banner3: typings.figlet.figletStrings.Banner3 = this.cast("Banner3")
  @scala.inline
  def `Banner3-D`: typings.figlet.figletStrings.`Banner3-D` = this.cast("Banner3-D")
  @scala.inline
  def Banner4: typings.figlet.figletStrings.Banner4 = this.cast("Banner4")
  @scala.inline
  def Barbwire: typings.figlet.figletStrings.Barbwire = this.cast("Barbwire")
  @scala.inline
  def Basic: typings.figlet.figletStrings.Basic = this.cast("Basic")
  @scala.inline
  def Bear: typings.figlet.figletStrings.Bear = this.cast("Bear")
  @scala.inline
  def Bell: typings.figlet.figletStrings.Bell = this.cast("Bell")
  @scala.inline
  def Benjamin: typings.figlet.figletStrings.Benjamin = this.cast("Benjamin")
  @scala.inline
  def Big: typings.figlet.figletStrings.Big = this.cast("Big")
  @scala.inline
  def `Big Chief`: typings.figlet.figletStrings.`Big Chief` = this.cast("Big Chief")
  @scala.inline
  def `Big Money-ne`: typings.figlet.figletStrings.`Big Money-ne` = this.cast("Big Money-ne")
  @scala.inline
  def `Big Money-nw`: typings.figlet.figletStrings.`Big Money-nw` = this.cast("Big Money-nw")
  @scala.inline
  def `Big Money-se`: typings.figlet.figletStrings.`Big Money-se` = this.cast("Big Money-se")
  @scala.inline
  def `Big Money-sw`: typings.figlet.figletStrings.`Big Money-sw` = this.cast("Big Money-sw")
  @scala.inline
  def Bigfig: typings.figlet.figletStrings.Bigfig = this.cast("Bigfig")
  @scala.inline
  def Binary: typings.figlet.figletStrings.Binary = this.cast("Binary")
  @scala.inline
  def Block: typings.figlet.figletStrings.Block = this.cast("Block")
  @scala.inline
  def Blocks: typings.figlet.figletStrings.Blocks = this.cast("Blocks")
  @scala.inline
  def Bloody: typings.figlet.figletStrings.Bloody = this.cast("Bloody")
  @scala.inline
  def Bolger: typings.figlet.figletStrings.Bolger = this.cast("Bolger")
  @scala.inline
  def Braced: typings.figlet.figletStrings.Braced = this.cast("Braced")
  @scala.inline
  def Bright: typings.figlet.figletStrings.Bright = this.cast("Bright")
  @scala.inline
  def Broadway: typings.figlet.figletStrings.Broadway = this.cast("Broadway")
  @scala.inline
  def `Broadway KB`: typings.figlet.figletStrings.`Broadway KB` = this.cast("Broadway KB")
  @scala.inline
  def Bubble: typings.figlet.figletStrings.Bubble = this.cast("Bubble")
  @scala.inline
  def Bulbhead: typings.figlet.figletStrings.Bulbhead = this.cast("Bulbhead")
  @scala.inline
  def Caligraphy: typings.figlet.figletStrings.Caligraphy = this.cast("Caligraphy")
  @scala.inline
  def Caligraphy2: typings.figlet.figletStrings.Caligraphy2 = this.cast("Caligraphy2")
  @scala.inline
  def `Calvin S`: typings.figlet.figletStrings.`Calvin S` = this.cast("Calvin S")
  @scala.inline
  def Cards: typings.figlet.figletStrings.Cards = this.cast("Cards")
  @scala.inline
  def Catwalk: typings.figlet.figletStrings.Catwalk = this.cast("Catwalk")
  @scala.inline
  def Chiseled: typings.figlet.figletStrings.Chiseled = this.cast("Chiseled")
  @scala.inline
  def Chunky: typings.figlet.figletStrings.Chunky = this.cast("Chunky")
  @scala.inline
  def Coinstak: typings.figlet.figletStrings.Coinstak = this.cast("Coinstak")
  @scala.inline
  def Cola: typings.figlet.figletStrings.Cola = this.cast("Cola")
  @scala.inline
  def Colossal: typings.figlet.figletStrings.Colossal = this.cast("Colossal")
  @scala.inline
  def Computer: typings.figlet.figletStrings.Computer = this.cast("Computer")
  @scala.inline
  def Contessa: typings.figlet.figletStrings.Contessa = this.cast("Contessa")
  @scala.inline
  def Contrast: typings.figlet.figletStrings.Contrast = this.cast("Contrast")
  @scala.inline
  def Cosmike: typings.figlet.figletStrings.Cosmike = this.cast("Cosmike")
  @scala.inline
  def Crawford: typings.figlet.figletStrings.Crawford = this.cast("Crawford")
  @scala.inline
  def Crawford2: typings.figlet.figletStrings.Crawford2 = this.cast("Crawford2")
  @scala.inline
  def Crazy: typings.figlet.figletStrings.Crazy = this.cast("Crazy")
  @scala.inline
  def Cricket: typings.figlet.figletStrings.Cricket = this.cast("Cricket")
  @scala.inline
  def Cursive: typings.figlet.figletStrings.Cursive = this.cast("Cursive")
  @scala.inline
  def Cyberlarge: typings.figlet.figletStrings.Cyberlarge = this.cast("Cyberlarge")
  @scala.inline
  def Cybermedium: typings.figlet.figletStrings.Cybermedium = this.cast("Cybermedium")
  @scala.inline
  def Cybersmall: typings.figlet.figletStrings.Cybersmall = this.cast("Cybersmall")
  @scala.inline
  def Cygnet: typings.figlet.figletStrings.Cygnet = this.cast("Cygnet")
  @scala.inline
  def DANC4: typings.figlet.figletStrings.DANC4 = this.cast("DANC4")
  @scala.inline
  def `DOS Rebel`: typings.figlet.figletStrings.`DOS Rebel` = this.cast("DOS Rebel")
  @scala.inline
  def DWhistled: typings.figlet.figletStrings.DWhistled = this.cast("DWhistled")
  @scala.inline
  def `Dancing Font`: typings.figlet.figletStrings.`Dancing Font` = this.cast("Dancing Font")
  @scala.inline
  def Decimal: typings.figlet.figletStrings.Decimal = this.cast("Decimal")
  @scala.inline
  def `Def Leppard`: typings.figlet.figletStrings.`Def Leppard` = this.cast("Def Leppard")
  @scala.inline
  def `Delta Corps Priest 1`: typings.figlet.figletStrings.`Delta Corps Priest 1` = this.cast("Delta Corps Priest 1")
  @scala.inline
  def Diamond: typings.figlet.figletStrings.Diamond = this.cast("Diamond")
  @scala.inline
  def `Diet Cola`: typings.figlet.figletStrings.`Diet Cola` = this.cast("Diet Cola")
  @scala.inline
  def Digital: typings.figlet.figletStrings.Digital = this.cast("Digital")
  @scala.inline
  def Doh: typings.figlet.figletStrings.Doh = this.cast("Doh")
  @scala.inline
  def Doom: typings.figlet.figletStrings.Doom = this.cast("Doom")
  @scala.inline
  def `Dot Matrix`: typings.figlet.figletStrings.`Dot Matrix` = this.cast("Dot Matrix")
  @scala.inline
  def Double: typings.figlet.figletStrings.Double = this.cast("Double")
  @scala.inline
  def `Double Shorts`: typings.figlet.figletStrings.`Double Shorts` = this.cast("Double Shorts")
  @scala.inline
  def `Dr Pepper`: typings.figlet.figletStrings.`Dr Pepper` = this.cast("Dr Pepper")
  @scala.inline
  def `Efti Chess`: typings.figlet.figletStrings.`Efti Chess` = this.cast("Efti Chess")
  @scala.inline
  def `Efti Font`: typings.figlet.figletStrings.`Efti Font` = this.cast("Efti Font")
  @scala.inline
  def `Efti Italic`: typings.figlet.figletStrings.`Efti Italic` = this.cast("Efti Italic")
  @scala.inline
  def `Efti Piti`: typings.figlet.figletStrings.`Efti Piti` = this.cast("Efti Piti")
  @scala.inline
  def `Efti Robot`: typings.figlet.figletStrings.`Efti Robot` = this.cast("Efti Robot")
  @scala.inline
  def `Efti Wall`: typings.figlet.figletStrings.`Efti Wall` = this.cast("Efti Wall")
  @scala.inline
  def `Efti Water`: typings.figlet.figletStrings.`Efti Water` = this.cast("Efti Water")
  @scala.inline
  def Electronic: typings.figlet.figletStrings.Electronic = this.cast("Electronic")
  @scala.inline
  def Elite: typings.figlet.figletStrings.Elite = this.cast("Elite")
  @scala.inline
  def Epic: typings.figlet.figletStrings.Epic = this.cast("Epic")
  @scala.inline
  def Fender: typings.figlet.figletStrings.Fender = this.cast("Fender")
  @scala.inline
  def Filter: typings.figlet.figletStrings.Filter = this.cast("Filter")
  @scala.inline
  def `Fire Font-k`: typings.figlet.figletStrings.`Fire Font-k` = this.cast("Fire Font-k")
  @scala.inline
  def `Fire Font-s`: typings.figlet.figletStrings.`Fire Font-s` = this.cast("Fire Font-s")
  @scala.inline
  def Flipped: typings.figlet.figletStrings.Flipped = this.cast("Flipped")
  @scala.inline
  def `Flower Power`: typings.figlet.figletStrings.`Flower Power` = this.cast("Flower Power")
  @scala.inline
  def `Four Tops`: typings.figlet.figletStrings.`Four Tops` = this.cast("Four Tops")
  @scala.inline
  def Fraktur: typings.figlet.figletStrings.Fraktur = this.cast("Fraktur")
  @scala.inline
  def `Fun Face`: typings.figlet.figletStrings.`Fun Face` = this.cast("Fun Face")
  @scala.inline
  def `Fun Faces`: typings.figlet.figletStrings.`Fun Faces` = this.cast("Fun Faces")
  @scala.inline
  def Fuzzy: typings.figlet.figletStrings.Fuzzy = this.cast("Fuzzy")
  @scala.inline
  def Georgi16: typings.figlet.figletStrings.Georgi16 = this.cast("Georgi16")
  @scala.inline
  def Georgia11: typings.figlet.figletStrings.Georgia11 = this.cast("Georgia11")
  @scala.inline
  def Ghost: typings.figlet.figletStrings.Ghost = this.cast("Ghost")
  @scala.inline
  def Ghoulish: typings.figlet.figletStrings.Ghoulish = this.cast("Ghoulish")
  @scala.inline
  def Glenyn: typings.figlet.figletStrings.Glenyn = this.cast("Glenyn")
  @scala.inline
  def Goofy: typings.figlet.figletStrings.Goofy = this.cast("Goofy")
  @scala.inline
  def Gothic: typings.figlet.figletStrings.Gothic = this.cast("Gothic")
  @scala.inline
  def Graceful: typings.figlet.figletStrings.Graceful = this.cast("Graceful")
  @scala.inline
  def Gradient: typings.figlet.figletStrings.Gradient = this.cast("Gradient")
  @scala.inline
  def Graffiti: typings.figlet.figletStrings.Graffiti = this.cast("Graffiti")
  @scala.inline
  def Greek: typings.figlet.figletStrings.Greek = this.cast("Greek")
  @scala.inline
  def `Heart Left`: typings.figlet.figletStrings.`Heart Left` = this.cast("Heart Left")
  @scala.inline
  def `Heart Right`: typings.figlet.figletStrings.`Heart Right` = this.cast("Heart Right")
  @scala.inline
  def `Henry 3D`: typings.figlet.figletStrings.`Henry 3D` = this.cast("Henry 3D")
  @scala.inline
  def Hex: typings.figlet.figletStrings.Hex = this.cast("Hex")
  @scala.inline
  def Hieroglyphs: typings.figlet.figletStrings.Hieroglyphs = this.cast("Hieroglyphs")
  @scala.inline
  def Hollywood: typings.figlet.figletStrings.Hollywood = this.cast("Hollywood")
  @scala.inline
  def `Horizontal Left`: typings.figlet.figletStrings.`Horizontal Left` = this.cast("Horizontal Left")
  @scala.inline
  def `Horizontal Right`: typings.figlet.figletStrings.`Horizontal Right` = this.cast("Horizontal Right")
  @scala.inline
  def `ICL-1900`: typings.figlet.figletStrings.`ICL-1900` = this.cast("ICL-1900")
  @scala.inline
  def Impossible: typings.figlet.figletStrings.Impossible = this.cast("Impossible")
  @scala.inline
  def Invita: typings.figlet.figletStrings.Invita = this.cast("Invita")
  @scala.inline
  def Isometric1: typings.figlet.figletStrings.Isometric1 = this.cast("Isometric1")
  @scala.inline
  def Isometric2: typings.figlet.figletStrings.Isometric2 = this.cast("Isometric2")
  @scala.inline
  def Isometric3: typings.figlet.figletStrings.Isometric3 = this.cast("Isometric3")
  @scala.inline
  def Isometric4: typings.figlet.figletStrings.Isometric4 = this.cast("Isometric4")
  @scala.inline
  def Italic: typings.figlet.figletStrings.Italic = this.cast("Italic")
  @scala.inline
  def Ivrit: typings.figlet.figletStrings.Ivrit = this.cast("Ivrit")
  @scala.inline
  def `JS Block Letters`: typings.figlet.figletStrings.`JS Block Letters` = this.cast("JS Block Letters")
  @scala.inline
  def `JS Bracket Letters`: typings.figlet.figletStrings.`JS Bracket Letters` = this.cast("JS Bracket Letters")
  @scala.inline
  def `JS Capital Curves`: typings.figlet.figletStrings.`JS Capital Curves` = this.cast("JS Capital Curves")
  @scala.inline
  def `JS Cursive`: typings.figlet.figletStrings.`JS Cursive` = this.cast("JS Cursive")
  @scala.inline
  def `JS Stick Letters`: typings.figlet.figletStrings.`JS Stick Letters` = this.cast("JS Stick Letters")
  @scala.inline
  def Jacky: typings.figlet.figletStrings.Jacky = this.cast("Jacky")
  @scala.inline
  def Jazmine: typings.figlet.figletStrings.Jazmine = this.cast("Jazmine")
  @scala.inline
  def Jerusalem: typings.figlet.figletStrings.Jerusalem = this.cast("Jerusalem")
  @scala.inline
  def Katakana: typings.figlet.figletStrings.Katakana = this.cast("Katakana")
  @scala.inline
  def Kban: typings.figlet.figletStrings.Kban = this.cast("Kban")
  @scala.inline
  def Keyboard: typings.figlet.figletStrings.Keyboard = this.cast("Keyboard")
  @scala.inline
  def Knob: typings.figlet.figletStrings.Knob = this.cast("Knob")
  @scala.inline
  def Konto: typings.figlet.figletStrings.Konto = this.cast("Konto")
  @scala.inline
  def `Konto Slant`: typings.figlet.figletStrings.`Konto Slant` = this.cast("Konto Slant")
  @scala.inline
  def LCD: typings.figlet.figletStrings.LCD = this.cast("LCD")
  @scala.inline
  def `Larry 3D`: typings.figlet.figletStrings.`Larry 3D` = this.cast("Larry 3D")
  @scala.inline
  def `Larry 3D 2`: typings.figlet.figletStrings.`Larry 3D 2` = this.cast("Larry 3D 2")
  @scala.inline
  def Lean: typings.figlet.figletStrings.Lean = this.cast("Lean")
  @scala.inline
  def Letters: typings.figlet.figletStrings.Letters = this.cast("Letters")
  @scala.inline
  def `Lil Devil`: typings.figlet.figletStrings.`Lil Devil` = this.cast("Lil Devil")
  @scala.inline
  def `Line Blocks`: typings.figlet.figletStrings.`Line Blocks` = this.cast("Line Blocks")
  @scala.inline
  def Linux: typings.figlet.figletStrings.Linux = this.cast("Linux")
  @scala.inline
  def Lockergnome: typings.figlet.figletStrings.Lockergnome = this.cast("Lockergnome")
  @scala.inline
  def Madrid: typings.figlet.figletStrings.Madrid = this.cast("Madrid")
  @scala.inline
  def Marquee: typings.figlet.figletStrings.Marquee = this.cast("Marquee")
  @scala.inline
  def Maxfour: typings.figlet.figletStrings.Maxfour = this.cast("Maxfour")
  @scala.inline
  def Merlin1: typings.figlet.figletStrings.Merlin1 = this.cast("Merlin1")
  @scala.inline
  def Merlin2: typings.figlet.figletStrings.Merlin2 = this.cast("Merlin2")
  @scala.inline
  def Mike: typings.figlet.figletStrings.Mike = this.cast("Mike")
  @scala.inline
  def Mini: typings.figlet.figletStrings.Mini = this.cast("Mini")
  @scala.inline
  def Mirror: typings.figlet.figletStrings.Mirror = this.cast("Mirror")
  @scala.inline
  def Mnemonic: typings.figlet.figletStrings.Mnemonic = this.cast("Mnemonic")
  @scala.inline
  def Modular: typings.figlet.figletStrings.Modular = this.cast("Modular")
  @scala.inline
  def Morse: typings.figlet.figletStrings.Morse = this.cast("Morse")
  @scala.inline
  def Morse2: typings.figlet.figletStrings.Morse2 = this.cast("Morse2")
  @scala.inline
  def Moscow: typings.figlet.figletStrings.Moscow = this.cast("Moscow")
  @scala.inline
  def Mshebrew210: typings.figlet.figletStrings.Mshebrew210 = this.cast("Mshebrew210")
  @scala.inline
  def Muzzle: typings.figlet.figletStrings.Muzzle = this.cast("Muzzle")
  @scala.inline
  def NScript: typings.figlet.figletStrings.NScript = this.cast("NScript")
  @scala.inline
  def `NT Greek`: typings.figlet.figletStrings.`NT Greek` = this.cast("NT Greek")
  @scala.inline
  def `NV Script`: typings.figlet.figletStrings.`NV Script` = this.cast("NV Script")
  @scala.inline
  def Nancyj: typings.figlet.figletStrings.Nancyj = this.cast("Nancyj")
  @scala.inline
  def `Nancyj-Fancy`: typings.figlet.figletStrings.`Nancyj-Fancy` = this.cast("Nancyj-Fancy")
  @scala.inline
  def `Nancyj-Improved`: typings.figlet.figletStrings.`Nancyj-Improved` = this.cast("Nancyj-Improved")
  @scala.inline
  def `Nancyj-Underlined`: typings.figlet.figletStrings.`Nancyj-Underlined` = this.cast("Nancyj-Underlined")
  @scala.inline
  def Nipples: typings.figlet.figletStrings.Nipples = this.cast("Nipples")
  @scala.inline
  def O8: typings.figlet.figletStrings.O8 = this.cast("O8")
  @scala.inline
  def OS2: typings.figlet.figletStrings.OS2 = this.cast("OS2")
  @scala.inline
  def Octal: typings.figlet.figletStrings.Octal = this.cast("Octal")
  @scala.inline
  def Ogre: typings.figlet.figletStrings.Ogre = this.cast("Ogre")
  @scala.inline
  def `Old Banner`: typings.figlet.figletStrings.`Old Banner` = this.cast("Old Banner")
  @scala.inline
  def `Patorjk_quotes Cheese`: typings.figlet.figletStrings.`Patorjk_quotes Cheese` = this.cast("Patorjk's Cheese")
  @scala.inline
  def `Patorjk-HeX`: typings.figlet.figletStrings.`Patorjk-HeX` = this.cast("Patorjk-HeX")
  @scala.inline
  def Pawp: typings.figlet.figletStrings.Pawp = this.cast("Pawp")
  @scala.inline
  def Peaks: typings.figlet.figletStrings.Peaks = this.cast("Peaks")
  @scala.inline
  def `Peaks Slant`: typings.figlet.figletStrings.`Peaks Slant` = this.cast("Peaks Slant")
  @scala.inline
  def Pebbles: typings.figlet.figletStrings.Pebbles = this.cast("Pebbles")
  @scala.inline
  def Pepper: typings.figlet.figletStrings.Pepper = this.cast("Pepper")
  @scala.inline
  def Poison: typings.figlet.figletStrings.Poison = this.cast("Poison")
  @scala.inline
  def Puffy: typings.figlet.figletStrings.Puffy = this.cast("Puffy")
  @scala.inline
  def Puzzle: typings.figlet.figletStrings.Puzzle = this.cast("Puzzle")
  @scala.inline
  def Pyramid: typings.figlet.figletStrings.Pyramid = this.cast("Pyramid")
  @scala.inline
  def Rammstein: typings.figlet.figletStrings.Rammstein = this.cast("Rammstein")
  @scala.inline
  def Rectangles: typings.figlet.figletStrings.Rectangles = this.cast("Rectangles")
  @scala.inline
  def `Red Phoenix`: typings.figlet.figletStrings.`Red Phoenix` = this.cast("Red Phoenix")
  @scala.inline
  def Relief: typings.figlet.figletStrings.Relief = this.cast("Relief")
  @scala.inline
  def Relief2: typings.figlet.figletStrings.Relief2 = this.cast("Relief2")
  @scala.inline
  def Reverse: typings.figlet.figletStrings.Reverse = this.cast("Reverse")
  @scala.inline
  def Roman: typings.figlet.figletStrings.Roman = this.cast("Roman")
  @scala.inline
  def Rot13: typings.figlet.figletStrings.Rot13 = this.cast("Rot13")
  @scala.inline
  def Rotated: typings.figlet.figletStrings.Rotated = this.cast("Rotated")
  @scala.inline
  def Rounded: typings.figlet.figletStrings.Rounded = this.cast("Rounded")
  @scala.inline
  def `Rowan Cap`: typings.figlet.figletStrings.`Rowan Cap` = this.cast("Rowan Cap")
  @scala.inline
  def Rozzo: typings.figlet.figletStrings.Rozzo = this.cast("Rozzo")
  @scala.inline
  def Runic: typings.figlet.figletStrings.Runic = this.cast("Runic")
  @scala.inline
  def Runyc: typings.figlet.figletStrings.Runyc = this.cast("Runyc")
  @scala.inline
  def `S Blood`: typings.figlet.figletStrings.`S Blood` = this.cast("S Blood")
  @scala.inline
  def `SL Script`: typings.figlet.figletStrings.`SL Script` = this.cast("SL Script")
  @scala.inline
  def `Santa Clara`: typings.figlet.figletStrings.`Santa Clara` = this.cast("Santa Clara")
  @scala.inline
  def Script: typings.figlet.figletStrings.Script = this.cast("Script")
  @scala.inline
  def Serifcap: typings.figlet.figletStrings.Serifcap = this.cast("Serifcap")
  @scala.inline
  def Shadow: typings.figlet.figletStrings.Shadow = this.cast("Shadow")
  @scala.inline
  def Shimrod: typings.figlet.figletStrings.Shimrod = this.cast("Shimrod")
  @scala.inline
  def Short: typings.figlet.figletStrings.Short = this.cast("Short")
  @scala.inline
  def Slant: typings.figlet.figletStrings.Slant = this.cast("Slant")
  @scala.inline
  def `Slant Relief`: typings.figlet.figletStrings.`Slant Relief` = this.cast("Slant Relief")
  @scala.inline
  def Slide: typings.figlet.figletStrings.Slide = this.cast("Slide")
  @scala.inline
  def Small: typings.figlet.figletStrings.Small = this.cast("Small")
  @scala.inline
  def `Small Caps`: typings.figlet.figletStrings.`Small Caps` = this.cast("Small Caps")
  @scala.inline
  def `Small Isometric1`: typings.figlet.figletStrings.`Small Isometric1` = this.cast("Small Isometric1")
  @scala.inline
  def `Small Keyboard`: typings.figlet.figletStrings.`Small Keyboard` = this.cast("Small Keyboard")
  @scala.inline
  def `Small Poison`: typings.figlet.figletStrings.`Small Poison` = this.cast("Small Poison")
  @scala.inline
  def `Small Script`: typings.figlet.figletStrings.`Small Script` = this.cast("Small Script")
  @scala.inline
  def `Small Shadow`: typings.figlet.figletStrings.`Small Shadow` = this.cast("Small Shadow")
  @scala.inline
  def `Small Slant`: typings.figlet.figletStrings.`Small Slant` = this.cast("Small Slant")
  @scala.inline
  def `Small Tengwar`: typings.figlet.figletStrings.`Small Tengwar` = this.cast("Small Tengwar")
  @scala.inline
  def Soft: typings.figlet.figletStrings.Soft = this.cast("Soft")
  @scala.inline
  def Speed: typings.figlet.figletStrings.Speed = this.cast("Speed")
  @scala.inline
  def Spliff: typings.figlet.figletStrings.Spliff = this.cast("Spliff")
  @scala.inline
  def Stacey: typings.figlet.figletStrings.Stacey = this.cast("Stacey")
  @scala.inline
  def Stampate: typings.figlet.figletStrings.Stampate = this.cast("Stampate")
  @scala.inline
  def Stampatello: typings.figlet.figletStrings.Stampatello = this.cast("Stampatello")
  @scala.inline
  def Standard: typings.figlet.figletStrings.Standard = this.cast("Standard")
  @scala.inline
  def `Star Strips`: typings.figlet.figletStrings.`Star Strips` = this.cast("Star Strips")
  @scala.inline
  def `Star Wars`: typings.figlet.figletStrings.`Star Wars` = this.cast("Star Wars")
  @scala.inline
  def Stellar: typings.figlet.figletStrings.Stellar = this.cast("Stellar")
  @scala.inline
  def Stforek: typings.figlet.figletStrings.Stforek = this.cast("Stforek")
  @scala.inline
  def `Stick Letters`: typings.figlet.figletStrings.`Stick Letters` = this.cast("Stick Letters")
  @scala.inline
  def Stop: typings.figlet.figletStrings.Stop = this.cast("Stop")
  @scala.inline
  def Straight: typings.figlet.figletStrings.Straight = this.cast("Straight")
  @scala.inline
  def `Stronger Than All`: typings.figlet.figletStrings.`Stronger Than All` = this.cast("Stronger Than All")
  @scala.inline
  def `Sub-Zero`: typings.figlet.figletStrings.`Sub-Zero` = this.cast("Sub-Zero")
  @scala.inline
  def `Swamp Land`: typings.figlet.figletStrings.`Swamp Land` = this.cast("Swamp Land")
  @scala.inline
  def Swan: typings.figlet.figletStrings.Swan = this.cast("Swan")
  @scala.inline
  def Sweet: typings.figlet.figletStrings.Sweet = this.cast("Sweet")
  @scala.inline
  def THIS: typings.figlet.figletStrings.THIS = this.cast("THIS")
  @scala.inline
  def Tanja: typings.figlet.figletStrings.Tanja = this.cast("Tanja")
  @scala.inline
  def Tengwar: typings.figlet.figletStrings.Tengwar = this.cast("Tengwar")
  @scala.inline
  def Term: typings.figlet.figletStrings.Term = this.cast("Term")
  @scala.inline
  def Test1: typings.figlet.figletStrings.Test1 = this.cast("Test1")
  @scala.inline
  def `The Edge`: typings.figlet.figletStrings.`The Edge` = this.cast("The Edge")
  @scala.inline
  def Thick: typings.figlet.figletStrings.Thick = this.cast("Thick")
  @scala.inline
  def Thin: typings.figlet.figletStrings.Thin = this.cast("Thin")
  @scala.inline
  def Thorned: typings.figlet.figletStrings.Thorned = this.cast("Thorned")
  @scala.inline
  def `Three Point`: typings.figlet.figletStrings.`Three Point` = this.cast("Three Point")
  @scala.inline
  def Ticks: typings.figlet.figletStrings.Ticks = this.cast("Ticks")
  @scala.inline
  def `Ticks Slant`: typings.figlet.figletStrings.`Ticks Slant` = this.cast("Ticks Slant")
  @scala.inline
  def Tiles: typings.figlet.figletStrings.Tiles = this.cast("Tiles")
  @scala.inline
  def `Tinker-Toy`: typings.figlet.figletStrings.`Tinker-Toy` = this.cast("Tinker-Toy")
  @scala.inline
  def Tombstone: typings.figlet.figletStrings.Tombstone = this.cast("Tombstone")
  @scala.inline
  def Train: typings.figlet.figletStrings.Train = this.cast("Train")
  @scala.inline
  def Trek: typings.figlet.figletStrings.Trek = this.cast("Trek")
  @scala.inline
  def Tsalagi: typings.figlet.figletStrings.Tsalagi = this.cast("Tsalagi")
  @scala.inline
  def Tubular: typings.figlet.figletStrings.Tubular = this.cast("Tubular")
  @scala.inline
  def Twisted: typings.figlet.figletStrings.Twisted = this.cast("Twisted")
  @scala.inline
  def `Two Point`: typings.figlet.figletStrings.`Two Point` = this.cast("Two Point")
  @scala.inline
  def `USA Flag`: typings.figlet.figletStrings.`USA Flag` = this.cast("USA Flag")
  @scala.inline
  def Univers: typings.figlet.figletStrings.Univers = this.cast("Univers")
  @scala.inline
  def Varsity: typings.figlet.figletStrings.Varsity = this.cast("Varsity")
  @scala.inline
  def Wavy: typings.figlet.figletStrings.Wavy = this.cast("Wavy")
  @scala.inline
  def Weird: typings.figlet.figletStrings.Weird = this.cast("Weird")
  @scala.inline
  def `Wet Letter`: typings.figlet.figletStrings.`Wet Letter` = this.cast("Wet Letter")
  @scala.inline
  def Whimsy: typings.figlet.figletStrings.Whimsy = this.cast("Whimsy")
  @scala.inline
  def Wow: typings.figlet.figletStrings.Wow = this.cast("Wow")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

@JSImport("figlet", "fonts")
@js.native
object fonts extends js.Object {
  /**
    * @warn
    * This method exists in node environment only.
    * In browser environment, this method does not exist.
    */
  def apply(cb: js.Function2[/* error */ Error | Null, /* fontList */ js.UndefOr[js.Array[Fonts]], Unit]): Unit = js.native
}

