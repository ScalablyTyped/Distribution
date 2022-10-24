organization := "org.scalablytyped"
name := "firebase__messaging"
version := "0.9.19-b2fca6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.8.2-7aa751",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.0-e8c69b",
  "org.scalablytyped" %%% "firebase__component" % "0.5.20-f485f2",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.3-947469",
  "org.scalablytyped" %%% "firebase__util" % "1.7.2-341bcd",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-556da5",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-7adbb2",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
