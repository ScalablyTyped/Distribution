organization := "org.scalablytyped"
name := "fontagon"
version := "1.1-dt-20211202Z-78ab65"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "svg2ttf" % "5.0-dt-20211202Z-b2b5a3",
  "org.scalablytyped" %%% "svgicons2svgfont" % "10.0-dt-20211202Z-ffacef",
  "org.scalablytyped" %%% "ttf2woff" % "2.0-dt-20211202Z-d105af")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
